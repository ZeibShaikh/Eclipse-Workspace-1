package com.zeib.firstpage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitForm")
public class FirstWeb extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myname=req.getParameter("name");
		String myemail=req.getParameter("email");
		System.out.println("My name is "+myname);
		System.out.println("My email is "+myemail);		
		
		PrintWriter out=resp.getWriter();
		out.println("My name is "+myname);
		out.println("My email is "+myemail);
	}
}
