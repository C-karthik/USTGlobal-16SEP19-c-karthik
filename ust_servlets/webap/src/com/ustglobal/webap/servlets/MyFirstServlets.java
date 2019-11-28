package com.ustglobal.webap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.print.attribute.standard.Severity;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlets extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		Object obj = req.getAttribute("obj"); //request attribute
		PrintWriter out1 = resp.getWriter();
		
		out1.println(obj);
		
		
		
		System.out.println("service method ");
		
	    System.out.println("extra line of code ");
		
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig conf = getServletConfig();
		String batchName = conf.getInitParameter("batch-name");
		
		//PrintWriter out1 = new PrintWriter();
		
		PrintWriter out = resp.getWriter();
		//resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		
		Date date = new Date();
		out.println("<h1 style = 'color : Green '> date and time : ");
		out.println(date.toString());
		
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
        out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		String url = req.getRequestURI();
		String method = req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);
		
		out.println("</body>");
		out.println("</html>");

		
		
		
		
	}
	
	
	
	
	
	
	

}
