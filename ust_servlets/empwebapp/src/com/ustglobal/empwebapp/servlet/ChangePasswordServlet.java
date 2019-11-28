package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;

@WebServlet("/changepassword")

public class ChangePasswordServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		HttpSession session = req.getSession(false);
		if(session !=  null) {

			String pass = req.getParameter("password");
			String confirmpass = req.getParameter("confirmpassword");

			if(pass.equals(confirmpass)) {

				EmployeeInfo info = (EmployeeInfo) session.getAttribute("info");
				EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
				dao.changePassword(info.getId(), pass);
				RequestDispatcher dis = req.getRequestDispatcher("/home");
				dis.forward(req, resp);
			} else {
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<h4> password not matching </h4>");
				out.println("</html>");

				RequestDispatcher dis = req.getRequestDispatcher("/changepassword.html");
				dis.include(req, resp);

			}//inner if condition ended
			
		} else {

			RequestDispatcher dis = req.getRequestDispatcher("/login.html");
			dis.forward(req, resp);
		}





	}

}
