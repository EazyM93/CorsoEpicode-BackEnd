package beans;

import org.springframework.context.annotation.Bean;

import entities.Drink;
import entities.DrinkLemonade;
import entities.Franchise;
import entities.FranchiseMug;
import entities.Menu;
import entities.Ordine;
import entities.PizzaHawaiian;
import entities.PizzaMargherita;
import entities.PizzaSalami;
import entities.ToppingCheese;
import entities.ToppingHam;

public class BeansConfig {

	@Bean
	public Menu menu() {

		Menu menu = new Menu();

		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaHawaiian());
		menu.getMenuPizza().add(pizzaSalami());

		menu.getMenuTopping().add(new ToppingCheese(null));
		menu.getMenuTopping().add(new ToppingHam(null));


		menu.getMenuDrink().add(drinkLemonade());
		
		menu.getMenuFranchise().add(franchiseMug());

		return menu;

	}
	
	@Bean
	public Ordine ordine() {

		Ordine ordine = new Ordine();

		return ordine;

	}

	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}

	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	@Bean
	public Drink drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	public Franchise franchiseMug() {
		return new FranchiseMug();
	}
	
}
