package day1_01_08_23.payloads;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class NewPostazioneBody {

	private int id_utente;
	private int id_postazione;
	private LocalDate date;
	
}
