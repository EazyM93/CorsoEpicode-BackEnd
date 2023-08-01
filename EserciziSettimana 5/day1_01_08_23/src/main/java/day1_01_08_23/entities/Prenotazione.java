package day1_01_08_23.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Prenotazione {

	private int id_prenotazione;
	private LocalDate dataPrenotazione;
	private Utente utente;
	private Postazione postazione;
	
}
