package com.zeib.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/regForm")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		String city=req.getParameter("city");
		
		try {
			String url="jdbc:mysql://localhost:3306/";
			String username="root";
			String password1="ZeibshaikhA@16";
			String database="Project1";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url+database,username,password1);
			String query="insert into register(name,email,password,gender,city) values(?,?,?,?,?)";
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, password);
			pstm.setString(4, gender);
			pstm.setString(5, city);
			int cnt=pstm.executeUpdate();
			if(cnt>0) {
				resp.setContentType("text/html");
				out.print("Registered Successfully!!");
				RequestDispatcher rd=req.getRequestDispatcher("/myForm.jsp");
				rd.include(req, resp);
			}
			else {
				resp.setContentType("text/html");
				out.print("User not registeredRegistered ");
				RequestDispatcher rd=req.getRequestDispatcher("/myForm.jsp");
				rd.include(req, resp);
			}
		}catch(Exception e) {
			e.printStackTrace();
			resp.setContentType("text/html");
			out.print("User not registeredRegistered "+e.getMessage());
			RequestDispatcher rd=req.getRequestDispatcher("/myForm.jsp");
			rd.include(req, resp);
		}
	}
}
