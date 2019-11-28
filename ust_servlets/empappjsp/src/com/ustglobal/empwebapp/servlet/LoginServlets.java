package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;


@WebServlet("/login")

public class LoginServlets extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		String rememberme = req.getParameter("rememberme");
				if(rememberme == null) {
					
					Cookie[] cookie = req.getCookies();
					
					if(cookie != null) {
						
						for (Cookie cookie2 : cookie) {
							
							if(cookie2.getName().equals("alwaysrememberme")) {
								cookie2.setMaxAge(0);
								resp.addCookie(cookie2);
							}
							
						}
						
						
					}
						
					
				}else {
					
					Cookie cookie = new Cookie("alwaysrememberme" , id+"");
					resp.addCookie(cookie);
					
				}
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info = dao.auth(id, password);
		
		
		if(info == null) {
			
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<h4 style = 'color : red'> invaid id or password </hr>");
			out.println("</html>");
			
			RequestDispatcher dis = req.getRequestDispatcher("./login.jsp");
			dis.include(req, resp);
			
		}else {
			
			HttpSession session = req.getSession(true);
			session.setAttribute("info", info);
			
			RequestDispatcher dis = req.getRequestDispatcher("/home");
			dis.forward(req, resp);
			
		}
		
		
	}

}
