package com.zeib.xmldemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	@Override
	protected void service(HttpServletRequest res, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("i am in register service method");
		PrintWriter out=resp.getWriter();
		out.print("i am for register browsr");
	}
}
