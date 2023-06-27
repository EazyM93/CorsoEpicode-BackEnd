package Esercizio2;

public class Esercizio2 {

	public static void main(String[] args) {
		
		// inizializzo sim
		Sim sim1 = new Sim("3318109053");
		
		// ricarico la sim
		sim1.ricarica(30);
		
		// simula chiamate
		sim1.aggiungiChiamata("3203718", 20);
		sim1.aggiungiChiamata("3203938", 20);
		sim1.aggiungiChiamata("3347850", 20);
		sim1.aggiungiChiamata("3237882", 20);
		sim1.aggiungiChiamata("3334737", 20);
		sim1.aggiungiChiamata("3243247", 20);
		sim1.aggiungiChiamata("3252545", 20);
		
		// stampa i dati della sim
		sim1.stampaDati();
		
	}
	
}
