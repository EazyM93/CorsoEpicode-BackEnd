package entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PartitaDiCalcio extends Evento{

	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int golCasa;
	private int golOspite;
	
	public PartitaDiCalcio(String titolo, String dataEvento, String descrizione,
			TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location,
			String squadraDiCasa, String squadraOspite, int golCasa, int golOspite) {
		
		this.squadraDiCasa = squadraDiCasa;
		this.squadraOspite = squadraOspite;
		this.squadraVincente = null;
		this.golCasa = golCasa;
		this.golOspite = golOspite;
	
	}
		
	public PartitaDiCalcio(String titolo, String dataEvento, String descrizione,
			TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location,
			String squadraDiCasa, String squadraOspite, String squadraVincente, int golCasa, int golOspite) {
		
		this.squadraDiCasa = squadraDiCasa;
		this.squadraOspite = squadraOspite;
		this.squadraVincente = squadraVincente;
		this.golCasa = golCasa;
		this.golOspite = golOspite;
		
	}

	@Override
	public String toString() {
		return "PartitaDiCalcio [squadraDiCasa=" + squadraDiCasa + ", squadraOspite=" + squadraOspite
				+ ", " + (squadraVincente != null ? "squadraVincente=" + squadraVincente + ", " : "")
				+ "golCasa=" + golCasa + ", golOspite=" + golOspite + "]";
	}
	
	
	
}
