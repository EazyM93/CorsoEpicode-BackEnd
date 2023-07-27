package day4_27_07_23.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@Getter
@Setter
@AllArgsConstructor
public abstract class Consumabili extends Prodotti{

	private Double calorie;	
	
}
