package com.training.comviva.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int quantityOnHand = Integer.parseInt(request.getParameter("quantityOnHand"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		String colors[] = request.getParameterValues("color");
		
		HttpSession session = request.getSession();
		session.setAttribute("pname", productName);
		
		response.setContentType("text/html");
		response.getWriter().println("<html>");
		response.getWriter().println("<body>");
		response.getWriter().println("<h2>Your entered product details ::");
		response.getWriter().println("<h2>Product ID : " + productId);
		response.getWriter().println("<h2>Product Name : " + productName);
		response.getWriter().println("<h2>Product QOH : " + quantityOnHand);
		response.getWriter().println("<h2>Product Price : " + price);
		response.getWriter().println("<h2><br/><br/><br/>Please check and confirm ::");
		
		response.getWriter().println("<h2><br/><br/><br/><a href=index.html>Home</a>");

		for(String s:colors) {
			response.getWriter().println("<h2>"+s);
		}
		response.getWriter().println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
