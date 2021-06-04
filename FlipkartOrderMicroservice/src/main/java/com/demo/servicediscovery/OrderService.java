package com.demo.servicediscovery;

import java.util.ArrayList;
import java.util.Date;



public class OrderService {

	public ArrayList<Orders> orderdetails = new ArrayList<>();

	public OrderService() {

		Orders orders1 = new Orders(111, new Date(), "Oxymeter");
		Orders orders2 = new Orders(222, new Date(), "BPMonitor");
		Orders orders3 = new Orders(333, new Date(), "Mask");
		Orders orders4 = new Orders(444, new Date(), "Vaccination");

		orderdetails.add(orders1);
		orderdetails.add(orders2);
		orderdetails.add(orders3);
		orderdetails.add(orders4);
	}

	public Orders getOrderDetails(int orderId) {

		Orders orderdetails = null;

		for (Orders orders : this.orderdetails) {

			if (orders.getOrderId() == orderId) {

				orderdetails = orders;
			}

		}

		return orderdetails;

	}

}
