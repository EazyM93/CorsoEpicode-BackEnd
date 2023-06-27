package Esercizio2;

public class Sim {

	private String numero;
	private double credito = 0;
	// essendo array di oggetti ogni elemento sarà di default null
	private Chiamata chiamate[] = new Chiamata[5];
	
	Sim(String _numero) {
		this.numero = _numero;
	}

	public void stampaDati() {
		System.out.println("Numero associato: " + this.numero);
		System.out.println("Credito Residuo: " + this.credito);
		System.out.println();
		System.out.println("Lista chiamate");
		
		// stampa tutto ciò che non è null
		for(Chiamata call: chiamate) {
			if(call != null) {
				System.out.println("- " + call.num + " / durata: " + call.durata + " minuti");
			}
		}
	}
	
	public void aggiungiChiamata(String num, int durata) {
		
		// ciclo gli elemnti dell' array e inserisce la chiamata nel primo elemento null che trova
		// una volta effettuato l'inserimento, con il break esce dal ciclo
		for(int i = this.chiamate.length - 1; i > 0; i--) {
			chiamate[i] = chiamate[i - 1];
		}
		
		chiamate[0] = new Chiamata(num, durata);
		
	}
	
	public void ricarica(double ricarica) {
		this.credito += ricarica;
	}
}
