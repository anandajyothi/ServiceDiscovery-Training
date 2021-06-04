package com.example.demo;

import java.util.Date;

import org.springframework.core.env.Environment;

public class Orders {

	private int orderId;
	private Date date;
	private String orderName;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Orders(int orderId, Date date, String orderName) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.orderName = orderName;
	}

	public Orders() {
		// TODO Auto-generated constructor stub
	}
	
	private String env;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
	
	
	
}
