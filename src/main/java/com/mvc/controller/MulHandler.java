package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.AddService;
import com.mvc.model.MulService;

public class MulHandler implements CommandHandler {
	
	private MulService mulService = new MulService();

	@Override
	public String handlerAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		
		int result = mulService.mul(n1, n2);
		
		req.setAttribute("result", result);
		
		return "/WEB-INF/mul.jsp";
	}

}
