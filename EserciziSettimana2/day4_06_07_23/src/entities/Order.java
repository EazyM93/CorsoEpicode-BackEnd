package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Order{
	
	//constructor attribute
	private Long id;
	private String status = "Pending";
	private Customer customer;
	
	// order / delivery attributes
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	
	// ordered products
	private List<Product> products = new ArrayList<Product>();
	
	public Order(Long _id, Customer _cust){
		this.id = _id;
		this.customer = _cust;
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
	
	// setter
	public void setStatus(String s) {
		this.status = s;
	}
	
	public void setOrderData(LocalDate d) {
		this.orderDate = d;
		this.setStatus("Delivered");
		this.deliveryDate = d.plusDays(2);
	}
	
	// methods
	public void addProduct(Product p) {
		products.add(p);
	}
	
}
