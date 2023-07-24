package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends Consumable implements InterfaceProduct{

	public Topping(String name, Double price, Double calories) {
		super(name, price, calories);
	}

	@Override
	public String toString() {
		return getName() + ", Calorie: " + getCalories() + ", Price: " + getPrice();
	}
	
	
}
