package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse  response) throws ServletException, IOException {
	String firstname = request.getParameter("firstName");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String gender = request.getParameter("gender");
	
	
	UserBean user = new UserBean();
	user.setFirstName(firstname);
	user.setEmail(email);
	user.setPassword(password);
	user.setGender(gender);
	
	System.out.println(firstname);
	System.out.println(password);
	System.out.println(gender);
	
	
	UserDao userDao = new  UserDao();
	userDao.addUser(user);
	
	
	response.sendRedirect("Login.jsp");
	
	
	
	
	}
}
