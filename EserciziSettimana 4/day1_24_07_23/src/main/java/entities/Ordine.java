package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Ordine {

	@Value("${application.coperto}")
	private int coperto;
	
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


	public void getOrdineCompleto() {
		System.out.println("ORDINE TAVOLO " + this.getTavolo().getNumeroTavolo());
		getOrdinePizza().forEach(o -> System.out.println("- " + o.getName() + " " + o.getPrice() + "€"));
		getOrdineBevande().forEach(b -> System.out.println("- " + b.getName() + " " + b.getPrice() + "€"));
		System.out.println("Coperti : " + getCostoCoperti() + "€");
		System.out.printf("Totale: %.2f €\n", getImportoTotale());
		System.out.println();
	}
	
	
}
