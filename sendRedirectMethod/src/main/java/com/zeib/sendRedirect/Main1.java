package com.zeib.sendRedirect;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/search1")
public class Main1 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String search=req.getParameter("search");
//		resp.sendRedirect("www.google.com/search?q="+search);
		resp.sendRedirect("https://www.google.com/search?q="+search);
	}
}
