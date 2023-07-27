package day4_27_07_23.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Prodotti {

	@Id
	@GeneratedValue
	private int id;
	
	private String nomeProdotto;
	private Double prezzo;
	
}
