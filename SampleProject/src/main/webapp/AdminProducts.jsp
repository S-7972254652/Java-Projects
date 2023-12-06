<!DOCTYPE html>
<html>
<head>
    <title>Admin Products</title>
</head>
<body>
    <h1>Admin Products</h1>
    <form action="ProductController" method="post">
        <input type="hidden" name="action" value="add" />
        <input type="text" name="productName" placeholder="Product Name" />
        <input type="submit" value="Add Product" />
    </form>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>
                    <a href="ProductController?action=edit&id=${product.id}">Edit</a>
                    <a href="ProductController?action=delete&id=${product.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
