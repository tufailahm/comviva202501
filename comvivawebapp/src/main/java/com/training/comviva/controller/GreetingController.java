package com.training.comviva.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingController
 */
@WebServlet(
		urlPatterns = { "/GreetingController" }, 
		initParams = { 
				@WebInitParam(name = "message", value = "WelcomeComviva"), 
				@WebInitParam(name = "username", value = "admin"), 
				@WebInitParam(name = "password", value = "admin@123")
		})
public class GreetingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    String msg,name ;
	public void init(ServletConfig config) throws ServletException {
		msg = config.getInitParameter("message");
		ServletContext sc = config.getServletContext();
		name = sc.getInitParameter("trainer");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("### Greeting Controller Do get called");
		response.getWriter().print(msg);
		response.getWriter().print("<h2>"+name);
		response.getWriter().println(request.getAttribute("com"));

}
	
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
