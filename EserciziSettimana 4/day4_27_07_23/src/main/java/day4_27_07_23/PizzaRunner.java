package day4_27_07_23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import day4_27_07_23.dao.PizzaDao;
import day4_27_07_23.entities.Pizza;

@Component
public class PizzaRunner implements CommandLineRunner{

	@Autowired
	private PizzaDao pd;
	
	@Override
	public void run(String... args) throws Exception {
		pd.save(Pizza.builder()
				.nomeProdotto("Pizza Margherita")
				.calories(1024.00)
				.prezzo(4.99)
				.build());
	}

}
