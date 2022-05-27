package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionState
 */
public class SessionState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionState() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>SessionState></title></head><body>");
		String submitvalue=request.getParameter("submit");
		HttpSession session = request.getSession(true);//create session id(token)
		System.out.println(session.getId());
		if(submitvalue.equals("result")) {
		//	response.sendRedirect("Result");//Navigating from one servlet to another servlet within the same website
		//	response.sendRedirect("http://www.google.com");//sendRedirect can also be used to navigate another website
			RequestDispatcher rd = request.getRequestDispatcher("Result");// Navigating from one servlet to another servlet within the same website
			// Cannot  be used for navigate to  another website
			rd.forward(request, response);
			// passing the request and response object received by the current servlet to the forwarded servlet.
		}
		else if (submitvalue.equals("set")){
		String salaryInput= request.getParameter("salary");
		session.setAttribute("salary", salaryInput);//store data in session scope for each user
		//session.setAttribute() Stores the data in a Collection using key and value.
		//salary = key,salaryInput=value.
		out.println("<h1>Value set </h1>" + salaryInput);
		} else if(submitvalue.equals("fetch")) {
//			String sessionsalary = session.getAttribute("salary").toString();
			String sessionsalary = (String) session.getAttribute("salary");
			if(sessionsalary == null)
			{
				out.println("<h1>SESSION NOT YET SET!!!</h1>");
			}
			out.println("<h1> Value Fetched</h1>" + sessionsalary);//returning value from sessionAttribute
	}
		out.println("</body></html>");
	}

}
