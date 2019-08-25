package com.hsbc.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.hsbc.dao.IOrderDao;
import com.hsbc.dao.OrderDaoImpl;
import com.hsbc.entity.Customer;
import com.hsbc.entity.Product;
import com.hsbc.exceptions.IDException;

public class OrderController {
	private IOrderDao dao = OrderDaoImpl.getDao();
	
	public String processViewById(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		try {
			Customer customer = dao.getCustDetails(cid);
			JSONObject json = new JSONObject(customer);
			PrintWriter out = response.getWriter();
			out.println(json);
		} catch(IDException e) {
			System.out.println(e.getMessage());
			response.setStatus(404);
		}
		return null;
	}
	
	public String processViewByType(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<Integer,Product> prod_map = null;
		int ptype = Integer.parseInt(request.getParameter("ptype"));
		try {
			prod_map = dao.getProduct(ptype);
			JSONObject json = new JSONObject(prod_map);
			PrintWriter out = response.getWriter();
			out.println(json);
		} catch(IDException e) {
			System.out.println(e.getMessage());
			response.setStatus(404);
		}
		return null;
	}
}
