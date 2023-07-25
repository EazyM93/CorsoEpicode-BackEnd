package entities;

import enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class Tavolo {

	private int numeroTavolo;
	private int copertiMax;
	private StatoTavolo stato;
	
}
