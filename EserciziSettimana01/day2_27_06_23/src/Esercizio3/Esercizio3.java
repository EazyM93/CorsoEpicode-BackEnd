package Esercizio3;

public class Esercizio3 {
	
	public static void main(String[] args) {
		
		// articoli nell'e-commerce
		Articolo iphone = new Articolo("001", "Iphone", 899.99, 10);
		Articolo macBook = new Articolo("002", "MacBook", 1199.99, 5);
		
		// creazione cliente
		Cliente manuel = new Cliente("01", "Manuel", "Centini", "manuel@gmail.com", "27-01-2023");
		
		// creazione carrello per specifico utente
		Carrello manuelCarrello = new Carrello(manuel);
		
		// aggiungi prodotti al carrello
		manuelCarrello.addArticolo(iphone);
		manuelCarrello.addArticolo(macBook);
		
		// mostra carrello
		manuelCarrello.mostraCarrello();
		
	}
	
}
