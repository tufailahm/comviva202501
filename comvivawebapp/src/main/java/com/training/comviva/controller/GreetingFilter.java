package com.training.comviva.controller;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class GreetingFilter
 */
@WebFilter(servletNames = { "GreetingController" },
urlPatterns = "/GreetingController")
public class GreetingFilter  implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public GreetingFilter() {
        super();

    	System.out.println("COns filter called");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		//pre
		System.out.println("###Greeting Fiter started");
		//code here to do pre processing
		request.setAttribute("com", "Hello Tufail");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		//post
		System.out.println("###Greeting Fiter Post");

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
