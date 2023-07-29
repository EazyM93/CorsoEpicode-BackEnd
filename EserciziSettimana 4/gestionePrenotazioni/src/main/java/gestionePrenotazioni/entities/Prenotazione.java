package gestionePrenotazioni.entities;

import java.time.LocalDate;

import org.springframework.context.annotation.Scope;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prenotazioni")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Prenotazione {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prenotazione_id;
	
	private LocalDate dataPrenotazione;
	
	@ManyToOne
	@JoinColumn(name = "id_utente")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "id_postazione")
	private Postazione postazione;
	
}
