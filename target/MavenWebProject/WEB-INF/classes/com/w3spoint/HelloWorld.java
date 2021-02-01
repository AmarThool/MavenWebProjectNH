package com.w3spoint;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        /**
         * @see HttpServlet#HttpServlet()
         */
	@WebServlet("/helloWorld")
        public HelloWorld() {
            super();
            // TODO Auto-generated constructor stub
         }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
                                       HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name").trim();
		response.setContentType("text/html"); 
    	        PrintWriter out = response.getWriter(); 
    	        out.print("<h2>Hello "+name+ "</h2>"); 
    	        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
                                       HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}