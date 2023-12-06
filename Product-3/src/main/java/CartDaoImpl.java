import java.sql.Connection;
import java.sql.PreparedStatement;

public class CartDaoImpl implements CartDao{

	private Connection conn;
	
	public CartDaoImpl(Connection conn) {
		this.conn=conn;
		
	}
	
	
	
	public boolean addCart(Cart c) {
		boolean f=false;
		try {
			
String sql="insert into cart(name,price,discount) values(?,?,?)";	
PreparedStatement ps=conn.prepareStatement(sql);

ps.setString(1, c.getName());
ps.setInt(2,c.getPrice());
ps.setInt(3, c.getDiscount());


int i=ps.executeUpdate();
if(i==1) {
	f=true;
}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
