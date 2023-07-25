package beans;

import java.time.LocalDateTime;

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
import entities.TavoloDaQuattro;
import entities.TavoloDaSei;
import entities.ToppingCheese;
import entities.ToppingHam;
import enums.StatoOrdine;

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
		
		Ordine ordine = new Ordine(1, StatoOrdine.IN_CORSO, 3, LocalDateTime.now(), tavoloDaQuattro());
		
		ordine.addPizzaAndSetTotale(pizzaHawaiian());
		ordine.addPizzaAndSetTotale(pizzaHawaiian());
		ordine.addPizzaAndSetTotale(pizzaMargherita());
		
		ordine.addBevandaAndSetTotale(drinkLemonade());
		ordine.addBevandaAndSetTotale(drinkLemonade());
		ordine.addBevandaAndSetTotale(drinkLemonade());
		
		return ordine;

	}
	
	
	@Bean
	public TavoloDaQuattro tavoloDaQuattro() {
		return new TavoloDaQuattro(); 
	} 
	
	@Bean
	public TavoloDaSei tavoloDaSei() {
		return new TavoloDaSei(); 
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
