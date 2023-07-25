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
	
}
