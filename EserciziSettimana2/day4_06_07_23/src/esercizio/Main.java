package esercizio;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entities.*;

public class Main {

	public static void main(String[] args) {
				
		// products list------------------------------------------------------------------
		List<Product> storeProducts = new ArrayList<Product>();
		storeProducts.add(new Product(0001L, "Libro uno", "Books", 9.90));
		storeProducts.add(new Product(0002L, "Libro due", "Books", 18.90));
		storeProducts.add(new Product(0003L, "Giocattolo uno", "Baby", 20.00));
		storeProducts.add(new Product(0004L, "Videogioco uno", "Boys", 59.90));
		storeProducts.add(new Product(0005L, "Videogioco due", "Boys", 69.90));
		storeProducts.add(new Product(0006L, "Videogioco tre", "Boys", 19.90));
		storeProducts.add(new Product(0006L, "Film uno", "Girls", 5.90));
		
		// exercise 1---------------------------------------------------------------------
		Predicate<Product> equalsBook = product -> product.getCategory().equals("Books");
		Predicate<Product> moreThanTen = product -> product.getPrice() > 10.00;
		
		List<Product> booksMoreThanTen = storeProducts.stream()
				.filter(equalsBook.and(moreThanTen))
				.collect(Collectors.toList());
		
		System.out.println("Libri che costano più di 10 €");
		for(Product book: booksMoreThanTen) System.out.printf("- %s\n",book.getName());
		
		System.out.println();
		
		// exercise 2--------------------------------------------------------------------
		List<Order> orderList = new ArrayList<Order>();
				
		Predicate<Product> equalsBaby = product -> product.getCategory().equals("Baby");
				
		List<Product> babyProducts = storeProducts.stream()
				.filter(equalsBaby)
				.collect(Collectors.toList());
		
		System.out.println("Prodotti per bambini");
		for(Product prod: babyProducts) System.out.printf("- %s\n",prod.getName());
		
		System.out.println();
		
		// exercise 3--------------------------------------------------------------------
		Predicate<Product> equalsBoys = product -> product.getCategory().equals("Boys");
		
		List<Product> boysProducts = storeProducts.stream()
				.filter(equalsBoys)
				.collect(Collectors.toList());
		
		System.out.println("Prodotti da ragazzi scontati");
		
//		boysProducts.stream().map(p -> );
		
		for(Product p: boysProducts) {
			p.setPrice(p.getPrice() * 0.10);
			System.out.printf("- %s scontato: %.2f €\n", p.getName(), p.getPrice());		
		}
		
		System.out.println();
		
		// exercise 4--------------------------------------------------------------------
		List<Order> orderStory = new ArrayList<Order>();
		
		Order manuelOrder = new Order(001L, new Customer(001L, "Manuel", 2));
		manuelOrder.addProduct(storeProducts.get(0));
		manuelOrder.addProduct(storeProducts.get(2));
		manuelOrder.setOrderData(LocalDate.of(2021, 3, 20));
		
		orderStory.add(manuelOrder);
		
		Order riccardoOrder = new Order(002L, new Customer(002L, "Riccardo", 1));
		riccardoOrder.addProduct(storeProducts.get(1));
		riccardoOrder.addProduct(storeProducts.get(5));
		riccardoOrder.addProduct(storeProducts.get(6));
		riccardoOrder.setOrderData(LocalDate.of(2021, 6, 10));
		
		orderStory.add(riccardoOrder);
		
		Predicate<Order> range = order -> order.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)) && order.getOrderDate().isBefore(LocalDate.of(2021, 4, 1));
		Predicate<Order> tier2 = order -> order.getCustomer().getTier() == 2;

		List<Order> orderInRangeTier2 =  orderStory.stream()
				.filter(range.and(tier2))
				.collect(Collectors.toList());
		
		System.out.println("Prodotti ordinati da clienti Tier2");
		for(Order ord: orderInRangeTier2) {
			for(Product p: ord.getProducts()) {
				System.out.printf("- %s\n",p.getName());
			}
		}
		
	}

}
