package com.hsbc.dao;

import java.util.ResourceBundle;

public class DatabaseConnection {
	private static ResourceBundle rb = ResourceBundle.getBundle("hsbc");
	public static final String DBURL = rb.getString("dburl");
	public static final String DRIVER = rb.getString("driver");
	
	public static String getDbUrl() {
		return DBURL;
	}
	
	public static String getDbDriver() {
		return DRIVER;
	}
}
