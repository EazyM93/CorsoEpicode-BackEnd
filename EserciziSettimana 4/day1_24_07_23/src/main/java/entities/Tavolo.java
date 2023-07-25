package entities;

import enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Tavolo {

	private Ordine ordine;
	private int numero;
	private int maxCoperti;
	private StatoTavolo stato;
	
	public Tavolo(Ordine ordine) {
		this.ordine = ordine;
	}
	
	
	
}
