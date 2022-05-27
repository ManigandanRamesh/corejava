package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitParam
 */
public class RequestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	System.out.println("dopost called");
	response.setContentType("text/html"); //we need content  type
	PrintWriter out = response.getWriter();
	String str_name = (String)request.getParameter("Name");// Request scope
	out.println("<div>"+str_name+"</div>");
	String str_Company =(String) request.getParameter("Company");//it read the key name given in html
	out.println("<div>"+str_Company+"</div>");
	
	out.println("inside");
	}

}
