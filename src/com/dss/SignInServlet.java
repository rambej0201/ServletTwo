package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//general settings
				/*initially response object will be empty 
				 * we should add content type to response object like text data, html data, etc*/
				/*To print response related data on client side we also need a print object
				 * We can print response content by using PrintWriter object & getWriter method*/
				response.setContentType("html/text");
				PrintWriter r = response.getWriter();
				
				r.println("This is my first get method base Servlet");
				r.print("<br>");
				r.println("I am writing this program from my car");
				r.println("<br>");
				r.println("My car is in red color");
				
				//gathering data
				/*We should gather the request data, the parameters sent to server from the client
				 * From client side we are passing String type data with logical names*/
				String nu = request.getParameter("uname");
				String pu = request.getParameter("upwd");
				
				//business logic, the logic we use for web application functionality
				if (nu.equals("shiva") && pu.equals("rgv1")) {
					r.println("<br>");
					r.println("Successfully get Connected");
					r.println("<br>");
					r.println("This is a get call");
					r.println("<br>");
					r.println("User name is "+nu);
					r.println("<br>");
					r.println("User Password is "+pu);
				} else {
					r.println("Connection failed");
					r.println("<br>");
					r.println("Wrong User Name or Password");
				}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//general settings
		/*initially response object will be empty 
		 * we should add content type to response object like text data, html data, etc*/
		/*To print response related data on client side we also need a print object
		 * We can print response content by using PrintWriter object & getWriter method*/
//		response.setContentType("html/text");
//		PrintWriter r = response.getWriter();
//		
//		r.println("This is my first Post method base Servlet");
//		r.print("<br>");
//		r.println("I am writing this program from my car");
//		r.println("<br>");
//		r.println("My car is in red color");
//		
//		//gathering data
//		/*We should gather the request data, the parameters sent to server from the client
//		 * From client side we are passing String type data with logical names*/
//		String nu = request.getParameter("uname");
//		String pu = request.getParameter("upwd");
//		
//		//business logic, the logic we use for web application functionality
//		if (nu.equals("shiva") && pu.equals("rgv1")) {
//			r.println("<br>");
//			r.println("Successfully Post Connected");
//			r.println("<br>");
//			r.println("This is a post call");
//			r.println("<br>");
//			r.println("User name is "+nu);
//			r.println("<br>");
//			r.println("User Password is "+pu);
//		} else {
//			r.println("Connection failed");
//			r.println("<br>");
//			r.println("Wrong User Name or Password");
//		} 
	}

}
