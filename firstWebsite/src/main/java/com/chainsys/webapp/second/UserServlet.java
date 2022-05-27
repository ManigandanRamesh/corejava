package com.chainsys.webapp.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.chainsys.miniproject.pojo.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		User userData = new  User();
		userData.setUserId("Manigandan");
		userData.setPassword("mani1234");
		String key = "user" +session.getId();
		session.setAttribute(key, userData);
		// value bound() in the user class will be called.
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.print("<form method='post'><input type='text' name='txt1'><p><input type='submit' name='btn1' value='ok'></form>");
		out.print("<p>USER SET TO SESSION !!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		HttpSession session = request.getSession(false);
		if(session == null) {
			out.print("session not created");
			return;
		}
		else {
			String key = "user" +session.getId();
			User userData = (User)session.getAttribute(key);
			if(userData == null) {
				out.print("Object removed from session ");
				return;
			}
			out.print("<p>user name : "+userData.getUserId());
			out.print("<p>password : "+userData.getPassword());
			session.removeAttribute("user");
			// this will remove user object from session collection
			// Value unbound() of the user will be called.
		}
		
	}

}
