package com.chainsys.webapp.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		try {
			p.print("Method: " + request.getMethod() + "<br>");
			p.print("Path Info: " + request.getPathInfo() + "<br>");
			p.print("Path translated: " + request.getPathTranslated() + "<br>");
			p.print("Context Path: " + request.getContextPath() + "<br>");
			p.print("Query String: " + request.getQueryString() + "<br>");
			p.print("Remote user: " + request.getRemoteUser() + "<br>");
			p.print("Principal: " + request.getUserPrincipal() + "<br>");
			p.print("SId:" + request.getRequestedSessionId() + "<br>");
			p.print("URI: " + request.getRequestURI() + "<br>");
			p.print("URL: " + request.getRequestURL() + "<br>");
			p.print("Servlet Path: " + request.getServletPath() + "<br>");
			p.print("Session: " + request.getSession() + "<br>");
			p.print("Session is valid: " + request.isRequestedSessionIdValid() + "<br>");
			p.print("From cookie? " + request.isRequestedSessionIdFromCookie() + "<br>");
			p.print("From URL? " + request.isRequestedSessionIdFromURL() + "<br>");
			p.print("<p>Parameter : " + request.getParameter("txt1"));
			
			p.print("<form method=get><input type=text name=txt1><input type=submit name=btn1 value=ok></form>");
			String ipAddress = request.getHeader("X-FORWARDED-FOR");  
			if (ipAddress == null) {  
			    ipAddress = request.getRemoteAddr();  
			}
			p.print("<p>ipAdress:" +ipAddress);
		}catch(Exception e) {
			p.print(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
