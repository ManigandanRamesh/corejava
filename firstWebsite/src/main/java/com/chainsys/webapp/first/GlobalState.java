package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GobalState
 */
public class GlobalState extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GlobalState() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Attributes</title></head><body>");
		/*
		 * Enumeration<String> names =request.getParameterNames();
		 * while(names.hasMoreElements()) { String parameterName=names.nextElement();
		 * System.out.println(parameterName); String [] values
		 * =request.getParameterValues(parameterName); int length= values.length;
		 * for(int i=0;i<length;i++) { System.out.println("Values : "+values[i]); } }
		 * String submitValue = request.getParameter("submit"); ServletContext ctx =
		 * this.getServletContext();// Get handle to Servletcontext maintained by tomcat
		 * server
		 */
		// collection of Strings
		 String submitValue = request.getParameter("submit");
			ServletContext ctx = this.getServletContext();// Get handle to servletContext maintained by Tomcat server
		if (submitValue.equals("set")) {
			String salaryInput = request.getParameter("salary");
			ctx.setAttribute("ctxsalary", salaryInput);// store data in servlet for all users
			// ctx.setAttribute() stores the data in a collection using key and value
			// ctxsalary=key,salaryInput=value
			out.println("<h1>value set</h1>" + salaryInput);
		} else if (submitValue.equals("fetch")) {
			// String contextsalary = (String) ctx.getAttribute("ctxsalary").toString();
			String contextSalary = (String) ctx.getAttribute("ctxsalary");
			if (contextSalary == null) {
				out.println("<h1>SESSION NOT YET SET!!!</h1>");
			}
			out.println("<h1>Value fetched</h1>" + contextSalary);// returning value from session attribute
		}
		out.println("</body></html>");
		// data stored in servlet context is multiuser, and can be
		// read or modified from all other servlets }
	}
}
