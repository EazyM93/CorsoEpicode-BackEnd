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
	Topping getTomato() {
		return new Topping("tomato", 100.00, 0.49);
	}
	
	@Bean
	Topping getCheese() {
		return new Topping("cheese", 92.00, 0.69);
	}
	
	@Bean
	Topping getHam() {
		return new Topping("ham", 35.00, 0.99);
	}
	
	@Bean
	Topping getPineapple() {
		return new Topping("pineapple", 24.00, 0.79);
	}
	
	@Bean
	Topping getSal() {
		return new Topping("salami", 86.00, 0.99);
	}
	
	@Bean
	String getHW() {
		return "Hello World";
	}
	
	@Bean
	Pizza getMargherita() {
		Pizza m = new Pizza("Margherita", 1104.00, 4.99);
		List<Topping> tl = new ArrayList<Topping>();
		tl.add(getTomato());
		tl.add(getCheese());
		m.addTopping(tl);
		return m;
	}
	
	@Bean
	Pizza getHawaiian() {
		Pizza m = new Pizza("Hawaiian", 1024.00, 6.49);
		List<Topping> tl = new ArrayList<Topping>();
		tl.addAll(getMargherita().getToppings());
		tl.add(getHam());
		tl.add(getPineapple());
		m.addTopping(tl);
		return m;
	}
	
	@Bean
	Pizza getSalami() {
		Pizza m = new Pizza("Salami", 1160.00, 5.99);
		List<Topping> tl = new ArrayList<Topping>();
		tl.addAll(getMargherita().getToppings());
		tl.add(getSal());
		m.addTopping(tl);
		return m;
	}
	
//	@Bean
//	Pizza oneTopping(Topping t) {
//		Pizza m = new Pizza("Personalizzata", 900.00, 8.99);
//		List<Topping> tl = new ArrayList<Topping>();
//		tl.add(t);
//		m.addTopping(tl);
//		return m;
//	}
}
