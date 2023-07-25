package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	
	List<MenuItem> ordine = new ArrayList<MenuItem>();
	private int numeroOrdine;
	private StatoOrdine stato;
	private int numeroCoperti;
	private LocalDateTime orario;
	private Double importoTotale;
		
	public void setImportoTotale() {
		double sum = 0;
		for(MenuItem e: ordine) sum += e.getPrice();
		sum += numeroCoperti * coperto;
		importoTotale += sum;
	}
	
	
	
}
