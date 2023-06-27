package Esercizio3;

public class Carrello {

	Articolo prodotti[] = new Articolo[0];
	Cliente currentClient;
	double totale = 0;
	
	// costruttore del carrello in base al cliente
	Carrello(Cliente _currentClient){
		this.currentClient = _currentClient;
	}
	
	// metodo che aggiunge articolo all'array degli articoli
	public void addArticolo(Articolo art) {
		Articolo newArr[] = new Articolo[prodotti.length + 1];
		for(int i = 0; i < prodotti.length; i++) {
			newArr[i] = prodotti[i];
		}
		newArr[newArr.length - 1] = art;
		prodotti = newArr;
	}
	
	// metodo che mostra il carrello e il costo totale
	public void mostraCarrello() {
		
		// richiamo il metodo per mostrare i dati del cliente
		this.currentClient.mostraCliente();
		
		// ciclo i prodotti del carrello e li stampo
		System.out.println("ELENCO PRODOTTI");
		for(Articolo prod: prodotti){
			System.out.printf("- %s \n", prod.descrizioneArticolo);
			this.totale += prod.prezzoArticolo;
		};
		
		// stampo il costo totale
		System.out.println();
		System.out.printf("Costo totale: %f", totale);
	}
}
