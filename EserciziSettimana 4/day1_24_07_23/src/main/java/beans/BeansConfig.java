package beans;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import entities.Drink;
import entities.DrinkLemonade;
import entities.Franchise;
import entities.FranchiseMug;
import entities.Menu;
import entities.Ordine;
import entities.Ordini;
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
	public Ordini ordini() {
		
		Ordini ordini = new Ordini();
		
		ordini.getOrdiniList().add(tavoloUno());
		ordini.getOrdiniList().add(tavoloDue());
		
		return ordini;

	}
	
	@Bean
	public Ordine tavoloUno() {
		
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
	public Ordine tavoloDue() {
		
		Ordine ordine = new Ordine(2, StatoOrdine.IN_CORSO, 5, LocalDateTime.now(), tavoloDaSei());
		
		ordine.addPizzaAndSetTotale(pizzaMargherita());
		ordine.addPizzaAndSetTotale(pizzaHawaiian());
		ordine.addPizzaAndSetTotale(pizzaMargherita());
		
		ordine.addBevandaAndSetTotale(drinkLemonade());
		ordine.addBevandaAndSetTotale(drinkLemonade());
		ordine.addBevandaAndSetTotale(drinkLemonade());
		
		return ordine;
	}
	
	@Bean
	@Scope("singleton")
	public TavoloDaQuattro tavoloDaQuattro() {
		return new TavoloDaQuattro(); 
	} 
	
	@Bean
	@Scope("singleton")
	public TavoloDaSei tavoloDaSei() {
		return new TavoloDaSei(); 
	} 
	
	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	@Scope("singleton")
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}

	@Bean
	@Scope("singleton")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	@Bean
	@Scope("singleton")
	public Drink drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	@Scope("singleton")
	public Franchise franchiseMug() {
		return new FranchiseMug();
	}
	
}
