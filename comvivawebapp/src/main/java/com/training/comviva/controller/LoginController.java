package com.training.comviva.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");  //Anu

		HttpSession session = request.getSession();
		session.setAttribute("currentUser", username);
		String password = request.getParameter("password");
		response.setContentType("text/html");
		
		Cookie allCookies[] = request.getCookies();
		boolean visited=false;
		for(Cookie c:allCookies)
		{
			if(c.getName().equals(username) && c.getValue().equals(password))
			{
				visited = true;
				break;
			}
		}
		if(!visited)
		{
			response.getWriter().println("<h2>Welcome  "+ username+ " in Comviva App");
			Cookie cookie = new Cookie(username, password);
			response.addCookie(cookie);
		}
		else
		{
			response.getWriter().println("<h2>Welcome Back "+ username+ " in Comviva App");

		}

		
		//validation 
		if(username.startsWith("A"))
		{
			//*** 
			//RequestDispatcher  dispatcher = 
			//		request.getRequestDispatcher("/HomeController");
			//dispatcher.forward(request, response);
			//dispatcher.include(request, response);
			response.getWriter().print("<a href=HomeController>Home page</a>");
		}
		else
		{
				response.getWriter().println
	("<h2>Invalid Username/password  <br/><br/><a href=index.html>Try Again</a>");
		}
	}
}
