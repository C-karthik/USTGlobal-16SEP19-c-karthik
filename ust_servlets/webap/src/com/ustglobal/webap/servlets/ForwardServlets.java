package com.ustglobal.webap.servlets;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlets extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		Object obj = new Object();
		req.setAttribute("obj", obj);
		
		
         RequestDispatcher rd = req.getRequestDispatcher("/first");
         
         rd.forward(req,resp);


	}

}
