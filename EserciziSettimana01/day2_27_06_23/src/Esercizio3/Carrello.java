package Esercizio3;

import java.util.ArrayList;

public class Carrello {

	ArrayList<Articolo> prodotti = new ArrayList<Articolo>();
	Cliente currentClient;
	double totale = 0;
			
	Carrello(Cliente _currentClient){
		this.currentClient = _currentClient;
	}
	
	public void addArticolo(Articolo art) {
		prodotti.add(art);
	}
	
	public void mostraCarrello() {		
		this.currentClient.mostraCliente();
		System.out.println("ELENCO PRODOTTI");
		prodotti.forEach(prod -> {
			System.out.printf("- %s \n", prod.descrizioneArticolo);
			this.totale += prod.prezzoArticolo;
		});
		
		System.out.printf("Costo totale: %f", totale);
	}
}
