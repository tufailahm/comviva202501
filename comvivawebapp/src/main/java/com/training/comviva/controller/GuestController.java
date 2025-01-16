package com.training.comviva.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuestController
 */
@WebServlet({ "/GuestController", "/guest" })
public class GuestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GuestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		counter = 1000;
		System.out.println("INIT CALLED");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("DESTROY CALLED");

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	int counter;
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DO GET CALLED");
		counter++;
		response.setContentType("text/html");
		response.getWriter().println("<html>");
		response.getWriter().println("<body>");
		response.getWriter().println("<h2>Welcome Guest");
		response.getWriter().println("<h2>You are visitor number : " + counter);
		response.getWriter().println("<h2><a href=login.html>Login</a>");

		response.getWriter().println("<h2><a href=product.html>Product App</a>");
		response.getWriter().println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
