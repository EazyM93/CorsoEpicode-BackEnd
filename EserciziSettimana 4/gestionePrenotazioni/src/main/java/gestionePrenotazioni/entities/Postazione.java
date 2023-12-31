package gestionePrenotazioni.entities;

import org.springframework.context.annotation.Scope;

import gestionePrenotazioni.enums.TipologiaPostazione;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="postazioni")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id_postazione;
	
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	private TipologiaPostazione tipo;
	
	@Column(name="max_occupanti")
	private int numerooccupantimax;
	
	@ManyToOne
	private Edificio edificio;
	
	
}
