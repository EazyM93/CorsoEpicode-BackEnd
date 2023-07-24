package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Consumable extends Products{

	private Double calories;

	public Consumable(String name, Double price, Double calories) {
		super(name, price);
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		return getName() + " - Calorie: " + getCalories() + " / Prezzo: " + getPrice() + "€";
	}
	
}
