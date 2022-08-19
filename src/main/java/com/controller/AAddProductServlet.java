package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

public class AAddProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("productName");
		int productPrice = Integer.parseInt(request.getParameter("productPrice"));
		int productQuantity = Integer.parseInt(request.getParameter("productQuantity"));
		String productCategory = request.getParameter("productCategory");

		ProductBean productBean = new ProductBean();
		productBean.setProductName(productName);
		productBean.setProductQuantity(productQuantity);
		productBean.setProductPrice(productPrice);
		productBean.setProductCategory(productCategory);
		int pId = (int) (Math.random() * 1000000);
		productBean.setProductId(pId);

		System.out.println(pId);
		System.out.println(productName);
		System.out.println(productPrice);
		System.out.println(productQuantity);
		System.out.println(productCategory);
		

		ProductDao productDao = new ProductDao();
		productDao.addProduct(productBean);
		System.out.println("Product Added Successfully");

		response.sendRedirect("DashBoard.jsp");
		
	}

}
