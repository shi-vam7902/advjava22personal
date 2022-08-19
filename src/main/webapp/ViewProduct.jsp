<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Product -Admin_ecom</title>
</head>
<body>
	<h1>Viewing The Product</h1>
	
	<%
		ArrayList<ProductBean> products = (ArrayList<ProductBean>)request.getAttribute("AllProducts");
	%>
	<table border="2" align="center">
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>ProductPrice</th>
			<th>ProductQuantity</th>
			<th>ProductCategory</th>
			<th>Action</th>
			<th>Edit</th>
			
		</tr>

		<tr>
			<%
			for (ProductBean product : products) {
			%>

			<td><%=product.getProductId()%></td>
			<td><%=product.getProductName()%></td>
			<td><%=product.getProductPrice()%></td>
			<td><%=product.getProductQuantity()%></td>
			<td><%=product.getProductCategory()%></td>
			<td><a href="DeleteUserServlet?Userid=<%=product.getProductId()%>">Delete</a> |
			<td><a href ="EditUserServlet?Userid=<%=product.getProductId()%>">Edit</a></td>
			
		</tr>
		<%
		}
		%>

	</table>
		
<th>DashBoard</th>
<a href="DashBoard.jsp">Click to Goto DashBoard</a>
</body>
</html>