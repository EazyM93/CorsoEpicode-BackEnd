package entities;

import java.util.Set;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GaraDiAtletica extends Evento{

	private Set<Persona> atleti;
	private Persona vincitore;
	
	public GaraDiAtletica(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti, Location location, Set<Persona> atleti, Persona vincitore) {
		
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
		this.atleti = atleti;
		this.vincitore = vincitore;
		 
	}

	@Override
	public String toString() {
		return "GaraDiAtletica [atleti=" + atleti + ", vincitore=" + vincitore + "]";
	}
	
	
	
}
