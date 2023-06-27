package Esercizio3;

import java.util.ArrayList;

public class Carrello {

	ArrayList<Articolo> prodotti = new ArrayList<Articolo>();
	Cliente currentClient;
	double totale = 0;
	
	// costruttore del carrello in base al cliente
	Carrello(Cliente _currentClient){
		this.currentClient = _currentClient;
	}
	
	// metodo che aggiunge articolo all'array degli articoli
	public void addArticolo(Articolo art) {
		prodotti.add(art);
	}
	
	// metodo che mostra il carrello e il costo totale
	public void mostraCarrello() {
		
		// richiamo il metodo per mostrare i dati del cliente
		this.currentClient.mostraCliente();
		
		// ciclo i prodotti del carrello e li stampo
		System.out.println("ELENCO PRODOTTI");
		prodotti.forEach(prod -> {
			System.out.printf("- %s \n", prod.descrizioneArticolo);
			this.totale += prod.prezzoArticolo;
		});
		
		// stampo il costo totale
		System.out.println();
		System.out.printf("Costo totale: %f", totale);
	}
}
