package entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Concerto extends Evento{

	private Genere genere;
	private boolean inStreming;
	
	public Concerto(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti, Location location, Genere genere, boolean inStreming) {
		
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
		this.genere = genere;
		this.inStreming = inStreming;
		
	}

	@Override
	public String toString() {
		return "Concerto [genere=" + genere + ", inStreming=" + inStreming + "]";
	}
	
	
	
	
}
