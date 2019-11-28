package com.ustglobal.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/add")

public class AddServlets extends HttpServlet{
	
	protected void service(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		
		int  i = Integer.parseInt(req.getParameter("num1"));
		int  j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
	//ACCessing these class arg to another cls 
		
		req.setAttribute("k",k);
		
		RequestDispatcher dis = req.getRequestDispatcher("sq");
		
		dis.forward(req, resp);
		
		//PrintWriter out = resp.getWriter();
		
		//out.println("result is = " + k);
		
		
		
		
		
	}

}
