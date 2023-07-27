package day4_27_07_23.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pizza {

	@Id
	@GeneratedValue
	private int id;
	
	private String nomeProdotto;
	private Double calories;
	private Double prezzo;
	
}
