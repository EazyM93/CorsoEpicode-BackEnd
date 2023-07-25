package entities;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;

import enums.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ordine {

	@Value("${application.coperto}")
	private int coperto;
	
	private int numeroOrdine;
	private StatoOrdine stato;
	private int numeroCoperti;
	private String orario;
	private Double importoTotale;
	
	public Ordine(LocalDateTime orario) {
		this.orario = orario.getHour() + ":" + orario.getMinute();
	}
	
	
	
}
