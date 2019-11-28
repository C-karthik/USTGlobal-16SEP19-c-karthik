package com.ustglobal.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")

public class SQServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		int k = (int) req.getAttribute("k");  //here we get  value of key i.e value of k as int not string
		
		k = k * k ;
		
		
		
	PrintWriter out = resp.getWriter();
	
	out.println("result of sq " + k);
	
		
		
	}

}
