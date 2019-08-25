package com.hsbc.dao;

import java.util.Map;

import com.hsbc.entity.Customer;
import com.hsbc.entity.Product;
import com.hsbc.exceptions.IDException;

public interface IOrderDao {
	Customer getCustDetails(int cid) throws IDException;
	Map<Integer,Product> getProduct(int categoryId) throws IDException;
}
