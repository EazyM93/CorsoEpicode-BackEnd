package day1_01_08_23.entities;

import day1_01_08_23.enums.TipologiaPostazione;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Postazione {

	private int id_postazione;
	private String descrizione;
	private TipologiaPostazione tipo;
	private int numeroOccupantiMax;
	private String city;
	
}
