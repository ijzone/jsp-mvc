package com.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = -8927306363073750638L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet initialized!");
		super.init();
	}

	@Override
	public void destroy() {
		System.out.println("Servlet destroyed!");
		super.destroy();
	}
	
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("Service!");
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String userPw = req.getParameter("userPw");
		
		if(userId.equals(userPw)) {
			resp.sendRedirect("/main.jsp");
			System.out.println("Login success");
		}else {
			resp.sendRedirect("login.jsp");
			System.out.println("Login fail");
		}
	}
	
	

}
