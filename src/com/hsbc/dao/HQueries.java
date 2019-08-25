package com.hsbc.dao;

public interface HQueries {
	String viewcstbyid = "SELECT * FROM Customer WHERE cid=?";
	String viewpdtbytype = "SELECT * FROM Product WHERE categoryId=?";
}
