package com.anil.servletdate;

import java.io.*;

import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class DateServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		//setting response content type
		res.setContentType("text/html");
		
		//getting PrintWriter obj
		PrintWriter pw= res.getWriter();
		
		//creating date obj
		Date dt= new Date();
		
		//desplaying result
		pw.println("<h2 style='color:red; text-align:center'>Date and Time is:: "+dt.toString()+"</h2>");
		
		res.setIntHeader("refresh", 1);
		
		pw.close();
	}
}
