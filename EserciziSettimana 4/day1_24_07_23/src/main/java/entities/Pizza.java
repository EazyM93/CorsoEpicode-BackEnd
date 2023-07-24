package entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Consumable implements InterfaceProduct{
	
	private List<Topping> toppings = new ArrayList<Topping>();
 	
	public Pizza(String name, Double calories, Double price) {
		super(name, calories, price);
	}
	
	public void addTopping(List<Topping> list) {
		toppings.addAll(list);
	}
	
	@Override
	public String toString() {
		String tp = "";
		for(int i = 0; i < toppings.size(); i++) {
			tp += toppings.get(i).getName();
			if(i != toppings.size()-1) tp += ", ";
		}
		return getName() + "(" + tp + ")" + ", Calorie: " + getCalories() + ", Price: " + getPrice();
	}

	

}
