<%@page import="com.bean.ProductBean"%>
<%@page import="com.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ecom User</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<jsp:include page="CustomerHeader.jsp"></jsp:include>
	<div class="container">
		<br> <br> <br>

		<%
		int productCounter = 0;
		for (int i = 1; i < Math.ceil(ProductDao.products.size() / 3.0); i++) {
		%>
		<div class="row">

			<%
			for (int j = 1; j <= 3; j++) {
				if (productCounter >= ProductDao.products.size())
					break;
				ProductBean p = ProductDao.products.get(productCounter);
			%>
			<div class="col-md-3">
			
				<div class="card">
			
					<div class="card-body">
			
						<h4 class="card-title"><%=p.getProductName()%></h4>
			
						<p class="card-text">
			
							Price:<%=p.getProductPrice()%><br> <br> Category:<%=p.getProductCategory()%>
			
						</p>
			
						<a href="AddToProductServlet?productId=<%=p.getProductId()%>&userId">Add to Cart</a>
			
					</div>
			
					<!-- card-body -->
			
				
			</div>
					<!-- card -->
				</div>
				<!-- col-md-3 -->
				<%
				productCounter++;
				}
				%>
			</div>
			<br>
			<!-- row -->
			<%
			}
			%>
		</div>
		<!-- container -->
</body>
</html>