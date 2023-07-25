package manuelcentini.day1_24_07_23;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.BeansConfig;
import entities.Ordine;
import lombok.Getter;

@Getter
public class GestioneOrdini {

	private Ordine ordine;
	private AnnotationConfigApplicationContext ctx;
	
	public GestioneOrdini() {
		ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
		ordine = (Ordine) ctx.getBean("ordine");

	}
	
	public void stampaOrdine() {
		System.out.println("Ordine corrente");
		ordine.getOrdinePizza().forEach(o -> System.out.println("- " + o.getName() + " " + o.getPrice() + "€"));
		ordine.getOrdineBevande().forEach(b -> System.out.println("- " + b.getName() + " " + b.getPrice() + "€"));
		System.out.println("Coperti : " + ordine.getCostoCoperti() + "€");
		System.out.printf("Totale: %.2f €", ordine.getImportoTotale());
	}
	
}
