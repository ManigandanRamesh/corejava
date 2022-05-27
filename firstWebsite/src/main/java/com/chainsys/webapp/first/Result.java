package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Result
 */
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>SessionState></title></head><body>");
		HttpSession session = request.getSession(true);
		String sessionsalary = (String) session.getAttribute("salary");
		if(sessionsalary == null)
  		{
			out.println("<h1>SESSION NOT YET SET!!!</h1>");
		}else {
		out.println("<h1> Value Fetched from Result</h1>" + sessionsalary);//returning value from sessionAttribute
}
		out.println("</body></html>");
		String submitvalue=request.getParameter("submit");
		if (submitvalue != null) {
			System.out.println(submitvalue);
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Dopost Called");
	doGet(request,response);
	}

}
