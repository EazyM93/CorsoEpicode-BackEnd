package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Prestito {

	@Id
	@ManyToOne
	private Utente utente;
	
	@ManyToOne
	private Lettura lettura;
	
	private LocalDate dataInizioPrestito;
	private LocalDate dataRestituzionePrevista;
	private LocalDate dataRestituzioneEffettiva;
	
	public Prestito(Utente utente, Lettura lettura, LocalDate dataInizioPrestito, LocalDate dataRestituzionePrevista,
			LocalDate dataRestituzioneEffettiva) {
		this.utente = utente;
		this.lettura = lettura;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista;
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
	
	
	
}
