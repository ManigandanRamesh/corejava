package com.chainsys.webapp.second;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookiesDemo
 */
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesDemo() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie [] allCookies = request.getCookies();
		if(allCookies==null) {
			System.out.println("no cookies found!!!");
			//TODO use logManager and log message instead of sysout
			return;
		}
		int cookielength = allCookies.length;
		for(int i= 0;i<cookielength;i++) {
			System.out.println(allCookies [i].getName()+"-"+allCookies[i].getValue());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Cookie firstCookie  = new Cookie("Captain", "kohli");
		firstCookie.setMaxAge(-1);
		// if value is zero or less than zero than cookie will get deleted immediately after the execution.
		// if the value is positive then the cookie will expire after the specified seconds (in seconds) 
		response.addCookie(firstCookie);
		Cookie secondCookie  = new Cookie("fruit", "apple");
		secondCookie.setMaxAge(2*24*60*60);
		// life set for two days
		response.addCookie(secondCookie);
		Cookie thirdCookie  = new Cookie("color", "red");
		response.addCookie(thirdCookie);
		Cookie fourthCookie  = new Cookie("dessert", "icecream");
		response.addCookie(fourthCookie);
	}

}
