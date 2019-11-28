package com.ustglobal.webap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlets extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig conf = getServletConfig();
		String batchName = conf.getInitParameter("batch-name");
		
		
		String ename = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1>");
		out.println(ename);
		out.println("</h1>");
		
		out.println("<h1>");
		out.println(email);
		out.println("</h1>");
		
		out.println("<h1>");
		out.println(pass);
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
        out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		out.println("</html>");
		out.println("</body>");
	
	}
	

}
