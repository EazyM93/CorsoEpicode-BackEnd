package entities;

public class Product extends Info{

	private String category;
	private Double price;
	
	public Product(Long _id, String _name, String _category, Double _price){
		super(_id, _name);
		this.category = _category;
		this.price = _price;
	}
	
	// getters
	public String getCategory() {
		return this.category;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	// setter
	public void setPrice(Double x) {
		this.price = x;
	}
}
