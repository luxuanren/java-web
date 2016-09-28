package com.luxuanren.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitServlet
 */
@WebServlet(
		description = "used to count visit times", 
		urlPatterns = { 
				"/VisitServlet", 
				"/login.jsp"
		}, 
		initParams = { 
				@WebInitParam(name = "counts", value = "0", description = "visit times")
		})
public class VisitServlet extends HttpServlet implements Filter {
	private static final long serialVersionUID = 1L;
	private int counts ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, javax.servlet.ServletException { 
        counts++;
        HttpServletRequest req = (HttpServletRequest) request;
        ServletContext context = req.getServletContext();
        context.setAttribute("counts", counts);
        chain.doFilter(request, response);
    }

	/**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig config) throws javax.servlet.ServletException { 
         counts = Integer.valueOf(config.getInitParameter("counts"));
         System.out.println(counts);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("visit times : " + counts++);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
