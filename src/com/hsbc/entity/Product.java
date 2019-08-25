package com.hsbc.entity;

public class Product {
	private int pid;
	private String pname;
	private double price;
	private int categoryId;
	private int compId;
	
	public Product(int pid, String pname, double price, int categoryId, int compId) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.categoryId = categoryId;
		this.compId = compId;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}
}
