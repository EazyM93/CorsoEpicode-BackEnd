package Esercizio2;

public class Esercizio2 {

	public static void main(String[] args) {
		
		Sim sim1 = new Sim("3318109053");
		
		sim1.ricarica(30);
		
		sim1.aggiungiChiamata("3203718", 20);
		sim1.aggiungiChiamata("3203938", 20);
		sim1.aggiungiChiamata("3347850", 20);
		sim1.aggiungiChiamata("3237882", 20);
		sim1.aggiungiChiamata("3334737", 20);
		
		sim1.stampaDati();
		
	}
	
}
