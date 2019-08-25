package com.hsbc.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.hsbc.entity.Customer;
import com.hsbc.entity.Product;
import com.hsbc.exceptions.IDException;

public class OrderDaoImpl implements IOrderDao {
	private static IOrderDao dao = new OrderDaoImpl();
	
	static {
		try {
			Class.forName(DatabaseConnection.getDbDriver());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private OrderDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static IOrderDao getDao() {
		return dao;
	}
	
	/**
	 * This method is used to get the customer information from the id
	 */
	@Override
	public Customer getCustDetails(int cid) throws IDException {
		Customer customer = null;
		try(Connection conn = DriverManager.getConnection(DatabaseConnection.getDbUrl())) {
			PreparedStatement st = conn.prepareStatement(HQueries.viewcstbyid);
			st.setInt(1, cid);
			ResultSet rs = st.executeQuery();
			if(rs.next()) 
				customer = new Customer(rs.getInt("cid"),rs.getString("cname"),rs.getString("address"),rs.getString("state"),rs.getString("email"),rs.getInt("pincode"),rs.getString("phone"),rs.getInt("gstNo"));	
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		if(customer==null)
			throw new IDException("ID doesn't exists");
		return customer;
	}

	@Override
	public Map<Integer,Product> getProduct(int categoryId) throws IDException {
		Map<Integer,Product> prod_map = new HashMap<Integer, Product>();
		Product product = null;
		try(Connection conn = DriverManager.getConnection(DatabaseConnection.getDbUrl())) {
			int count=0;
			PreparedStatement st = conn.prepareStatement(HQueries.viewpdtbytype);
			st.setInt(1, categoryId);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				product = new Product(rs.getInt("pid"),rs.getString("pname"),rs.getDouble("price"),rs.getInt("categoryId"),rs.getInt("compId"));
				prod_map.put(count++, product);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		if(product==null)
			throw new IDException("No such type of product available");
		return prod_map;
	}
	
}
