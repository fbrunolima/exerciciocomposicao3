package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> products = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		products.add(item);
		
	}
	
	public void removeItem(OrderItem item) {
		products.remove(item);
	
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem item : products) {
			sum += item.subTotal();
		}
		return sum;
	}
}