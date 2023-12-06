import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
    private ProductService productService;

    public void init() {
        productService = new ProductService(); // Assuming ProductService handles the business logic
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("add")) {
            String productName = request.getParameter("productName");
            Product product = new Product();
            productService.addProduct(product);
        }
        // Handle other actions such as edit and delete

        response.sendRedirect("AdminProducts.jsp");
    }
}

public class Product {
    private int id;
    private String name;

    // Constructors, getters, setters, etc.
}

public class ProductService {
    private ProductDAO productDAO;

    public ProductService() {
        productDAO = new ProductDAO(); // Assuming ProductDAO handles database operations
    }

    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    // Implement other methods for editing and deleting products
}


public class ProductDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String DB_USERNAME = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public void addProduct(Product product) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement statement = conn.prepareStatement("INSERT INTO products (name) VALUES (?)")) {
            statement.setString(1, product.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Implement other methods for editing and deleting products
}







