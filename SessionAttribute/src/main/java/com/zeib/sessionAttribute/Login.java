package com.zeib.sessionAttribute;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/session")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.equals("zeibshaikh16@gmail.com")&&password.equals("123")) {
			
			HttpSession session=req.getSession();
			session.setAttribute("name_key", "Zeib Shaikh");
			
			RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
			rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.print("Enter valid credentials");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
