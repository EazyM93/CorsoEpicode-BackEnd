package day4_27_07_23.entities; 

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PizzaMargherita extends Consumabili{

	public PizzaMargherita() {
		super("Pizza Margherita (tomato, cheese)", 4.99, 1104d);
	}
	
}
