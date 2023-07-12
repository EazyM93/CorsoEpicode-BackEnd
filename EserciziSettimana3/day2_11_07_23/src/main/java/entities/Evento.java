package entities;


import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "gestioneventi")
@Getter
@Setter
public class Evento {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String titolo;
	private LocalDate dataEvento;
	private String descrizione;
	private int numeroMassimoPartecipanti;
	
	@OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
	private Set<Partecipazione> partecipazioni;
	
	@ManyToOne
	private Location location;
	
	@Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
	
	public Evento() {}
	
	public Evento(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location) {
		this.titolo = titolo;
		this.dataEvento = LocalDate.parse(dataEvento);
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
		this.location = location;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = LocalDate.parse(dataEvento);
	}
	
	@Override
	public String toString() {
		return String.format("DATI EVENTO\n- id: %s\n- titolo: %s\n- data: %s\n- descrizione: %s\n- tipo: %s\n- max partecipanti: %s",
				this.getId(), this.getTitolo(), this.getDataEvento(), this.getDescrizione(), this.getTipoEvento(), this.getNumeroMassimoPartecipanti());
	}
	
	
}
