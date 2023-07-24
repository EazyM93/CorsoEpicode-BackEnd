package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drinks extends Consumable{

	public Drinks(String name, Double price, Double calories) {
		super(name, price, calories);
	}

}
