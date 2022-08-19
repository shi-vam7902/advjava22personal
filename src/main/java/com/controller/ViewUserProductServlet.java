package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

public class ViewUserProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProductDao productDao = new ProductDao();
		ArrayList<ProductBean> products = productDao.getAllProducts();
		for(int i =0;i<=products.size();i++ )
		{
			request.setAttribute("name",products.get(i).getProductName());
			request.setAttribute("price",products.get(i).getProductPrice());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("ViewUserProduct.jsp");
		rd.forward(request, response);
		
	}

}
