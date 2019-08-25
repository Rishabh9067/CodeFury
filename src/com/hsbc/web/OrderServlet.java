package com.hsbc.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet({"/OrderServlet","/viewbyid.htm","/viewproductbytype.htm"})
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OrderController action = new OrderController();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getServletPath();
		String view=null;
		RequestDispatcher rd = null;
		switch(url) {
		case "/viewbyid.htm":
			view = action.processViewById(request,response);
			break;
		case "/viewproductbytype.htm":
			view = action.processViewByType(request,response);
			break;
		}
		
		if(view!=null) {
			rd = request.getRequestDispatcher(response.encodeUrl(view));
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
