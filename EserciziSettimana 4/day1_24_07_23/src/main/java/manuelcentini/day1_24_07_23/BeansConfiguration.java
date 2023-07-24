package manuelcentini.day1_24_07_23;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entities.Pizza;
import entities.Topping;

@Configuration
public class BeansConfiguration {

	@Bean
	String getHW() {
		return "Hello World";
	}
	
	@Bean
	Pizza getMargherita() {
		Pizza m = new Pizza("Margherita", 1104.00, 4.99);
		List<Topping> tl = new ArrayList<Topping>();
		tl.add(new Topping("tomato", 100.00, 0.49));
		tl.add(new Topping("cheese", 50.00, 0.39));
		m.addTopping(tl);
		return m;
	}
	
	@Bean
	Pizza getHawaiian() {
		Pizza m = new Pizza("Hawaiian", 1024.00, 6.49);
		List<Topping> tl = new ArrayList<Topping>();
		tl.add(new Topping("tomato", 100.00, 0.49));
		tl.add(new Topping("cheese", 50.00, 0.39));
		m.addTopping(tl);
		return m;
	}
	
	@Bean
	Pizza getMargherita() {
		Pizza m = new Pizza("Margherita", 1104.00, 4.99);
		List<Topping> tl = new ArrayList<Topping>();
		tl.add(new Topping("tomato", 100.00, 0.49));
		tl.add(new Topping("cheese", 50.00, 0.39));
		m.addTopping(tl);
		return m;
	}
}
