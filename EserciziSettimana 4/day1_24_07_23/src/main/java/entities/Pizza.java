package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Consumable implements InterfaceProduct{
	
 	
	public Pizza(String name, Double price, Double calories) {
		super(name, calories, price);
	}

}
