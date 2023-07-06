package entities;

public class Customer extends Info {

	private int tier;
	
	public Customer(Long _id, String _name, int _tier){
		super(_id, _name);
		this.tier = _tier;
 	}
	
	// getters
	public int getTier() {
		return this.tier;
	}
}
