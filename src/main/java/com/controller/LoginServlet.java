package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println(email);
		System.out.println(password);

		boolean isError = false;

		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter the  Email");
		} else {
			request.setAttribute("emailvalue", email);
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("PasswordError", "Please Enter the Password ");
		} else {
			request.setAttribute("emailvalue", email);
		}

		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		} else {

			UserDao userDao = new UserDao();
			UserBean user = userDao.authenticate(email, password);
			
			boolean iscorrect = false;
			
			RequestDispatcher rd = null;
			if (user == null) {
				request.setAttribute("error", "Invalid Credentials");
				rd = request.getRequestDispatcher("Login.jsp");
			} else {
				request.setAttribute("Message", "Hurray Logged in");
				
				Cookie c = new Cookie("userid", user.getUserId()+"");
				response.addCookie(c);
				

				if (user.getRole().equals("admin")) {
					iscorrect = true;
					rd = request.getRequestDispatcher("DashBoard.jsp");
				} else if (user.getRole().equals("customer")) {
					iscorrect = true;
					
					rd = request.getRequestDispatcher("Home.jsp");
				} else {
					request.setAttribute("Error", "Please Contact Admin");
					iscorrect = true;
					rd = request.getRequestDispatcher("Login.jsp");
				}
				System.out.println(iscorrect);
				
				if(iscorrect == true)
				{
					System.out.println("in frwd");
					rd.forward(request, response);
				}
				else
				{
					rd = request.getRequestDispatcher("Login.jsp");
				}
			}
			

		}

	}

}
