package entities;


import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gestioneventi")
public class Evento {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String titolo;
	private LocalDate dataEvento;
	private String descrizione;
	private int numeroMassimoPartecipanti;
	
	@Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
	
	public Evento() {}
	
	public Evento(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti) {
		this.titolo = titolo;
		this.dataEvento = LocalDate.parse(dataEvento);
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public UUID getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public int getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = LocalDate.parse(dataEvento);
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}
	
	@Override
	public String toString() {
		return String.format("DATI EVENTO\n- id: %s\n- titolo: %s\n- data: %s\n- descrizione: %s\n- tipo: %s\n- max partecipanti: %s",
				this.getId(), this.getTitolo(), this.getDataEvento(), this.getDescrizione(), this.getTipoEvento(), this.getNumeroMassimoPartecipanti());
	}
	
	
}
