package com.ustglobal.empwebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);  //validation purpose if data contains gives true create new session r else store in sage page
		
		if(session != null) {
			
			session.invalidate();
		}else {
			
			RequestDispatcher dis = req.getRequestDispatcher("/login.jsp");
			dis.forward(req, resp);
		}
		
		
		
	}
	

}
