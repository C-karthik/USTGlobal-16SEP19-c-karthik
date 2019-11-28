package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = "";
		Cookie[] cookie = req.getCookies();
		if (cookie != null) {
			for (Cookie cookie2 : cookie) {
				if (cookie2.getName().equals("alwaysrememberme")) {
					id = cookie2.getValue();
				}
			}
		}
		

		// dynamic loginpage

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		// out.println("<body>");

		out.println("<form action='./login' method = 'post' style = 'border'>");
		out.println("<h1 align = 'center'>Sign in </h1>");
		out.println("<table align = 'center'>");
		out.println("<tr><td> Id : </td><td> <input type = 'number' name = 'id' value = '" + id + "'> </td></tr>");
		out.println("<tr><td> password : </td><td> <input type = 'password' name = 'password' > </td></tr>");
		out.println(
				"<tr><td> <input type = 'checkbox' name = 'rememberme' value = 'check'> </td><td> remberme </td></tr>");
		out.println(
				"<tr align = 'center'><td align = 'left'><input type= 'reset' name = 'reset'> </td><td> <input type = 'submit' name = 'login' > </td></tr>");
		out.println("<tr><td><a href = 'register.html'>register</a></td></tr>");
		out.println("</table>	");
		out.println("</form>");
		// out.println("</body>");
		out.println("</html>");

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
