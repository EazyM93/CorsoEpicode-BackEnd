package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@PropertySource("classpath:application.properties")
public class Ordine {

//	@Value("${application.coperto}")
	private int coperto = 2;
	
	private List<PizzaBase> ordinePizza = new ArrayList<PizzaBase>();
	private List<Drink> ordineBevande = new ArrayList<Drink>();
	private int numeroOrdine;
	private StatoOrdine stato;
	private int numeroCoperti;
	private LocalDateTime orario;
	private Double importoTotale;
	private Tavolo tavolo;
	
	public Ordine(int numeroOrdine, StatoOrdine stato, int numeroCoperti, LocalDateTime orario, Tavolo tavolo) {
		this.numeroOrdine = numeroOrdine;
		this.stato = stato;
		this.numeroCoperti = numeroCoperti;
		this.orario = orario;
		this.importoTotale = (double) (numeroCoperti * coperto);
		this.tavolo = tavolo;
	}
		
	public void addPizzaAndSetTotale(PizzaBase p) {
		ordinePizza.add(p);
		importoTotale += p.getPrice();
	}

	public void addBevandaAndSetTotale(Drink d) {
		ordineBevande.add(d);
		importoTotale += d.getPrice();
	}

	public int getCostoCoperti() {
		return numeroCoperti * coperto;
	}


	
	
	
}
