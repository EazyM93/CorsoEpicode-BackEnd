package manuelcentini.day1_24_07_23;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.BeansConfig;
import entities.Ordini;
import lombok.Getter;

@Getter
public class GestioneOrdini {

	private Ordini ordini;
	private AnnotationConfigApplicationContext ctx;
	
	public GestioneOrdini() {
		ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
		ordini = (Ordini) ctx.getBean("ordini");

	}
	
	public void stampaOrdine() {
		System.out.println("---------------------------------ORDINI CORRENTI");
		ordini.getOrdiniList().forEach(ordine -> ordine.getOrdineCompleto());
		
	}
	
}
