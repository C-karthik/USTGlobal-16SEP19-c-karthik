package com.ustglobal.webap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectiveServlets  extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String search = req.getParameter("search");
		//resp.sendRedirect("https://www.google.com/search?q="+search);

        String radio = req.getParameter("select");
        
        if(radio.equals ("Google")) {
        	 resp.sendRedirect("https://www.google.com/search?q="+search);
        	
        }else if(radio.equals("Bing")) {
        	resp.sendRedirect("https://www.bing.com/search?q="+search);
                	
        	
        }else if(radio.equals("Yahoo")){
        	
        	resp.sendRedirect("https://in.search.yahoo.com/search?p="+search);
        }
       

	}

}
