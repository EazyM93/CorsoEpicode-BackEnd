package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order{

	private Long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Product> products = new ArrayList<Product>();
	private Customer customer;
	
	Order(Long _id, String _status, LocalDate _orderDate, Product _prod, Customer _cust){
		this.id = _id;
		this.status = _status;
		this.orderDate = _orderDate;
		this.deliveryDate = _orderDate.plusDays(2);
		this.customer = _cust;
		products.add(_prod);
	}	
	
	// getters
	public Long getId() {
		return this.id;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public LocalDate getOrderDate() {
		return this.orderDate;
	}
	
	public LocalDate getDeliveryDate() {
		return this.deliveryDate;
	}
	
	public List<Product> getProducts() {
		return this.products;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
}
