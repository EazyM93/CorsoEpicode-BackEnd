package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Franchise extends Products{

	public Franchise(String name, Double price) {
		super(name, price);
	}
	

}
