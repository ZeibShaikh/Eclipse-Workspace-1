package com.zeib.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitForm")
public class Index extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.equals("zeibshaikh16@gmail.com")&&password.equals("Zeibshaikh123")) {
			RequestDispatcher rd=req.getRequestDispatcher("/go.jsp");
			rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.print("Enter correct credentials");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}
}
