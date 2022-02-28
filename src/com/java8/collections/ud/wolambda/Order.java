package com.java8.collections.ud.wolambda;

public class Order implements Comparable<Order> {

	private int orderId;
	private String orderName;
	private int orderValue;
	
	public Order() {
		super();
		
	}

	public Order(int orderId, String orderName, int orderValue) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderValue = orderValue;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(int orderValue) {
		this.orderValue = orderValue;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderValue=" + orderValue + "]";
	}

	@Override
	public int compareTo(Order o) {
		
		if(orderId<o.getOrderId())
		{
			return 1;
		}
		else if(orderId>o.getOrderId())	
		{
			return -1;
		}
		return 0;
	}
	
	

}
