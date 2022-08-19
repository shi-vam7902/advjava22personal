<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddProduct Admin_ecom</title>
</head>
<body>
	
	
<!-- 
producdId
productName
productPrice
productQuantity
productCategory
 -->

<form action="AAddProductServlet" method="post">
		
		ProductName : <input type="text" name="productName"><br><br>
		ProductPrice :<input type="text" name="productPrice"><br><br>
		ProductQuantity:<input type="text" name="productQuantity"><br><br>
		ProductCategory :<input type="text" name="productCategory"><br><br>
		<input type="submit" value="Add Product">
				
</form>	
	
	
</body>
</html>