package Esercizio2;

public class Sim {

	private String numero;
	private double credito = 0;
	private Chiamata chiamate[] = new Chiamata[5]; 
	
	Sim(String _numero) {
		this.numero = _numero;
	}

	public void stampaDati() {
		System.out.println("Numero associato: " + this.numero);
		System.out.println("Credito Residuo: " + this.credito);
		System.out.println();
		System.out.println("Lista chiamate");
		for(Chiamata call: chiamate) {
			if(call != null) {
				System.out.println("- " + call.num + " / durata: " + call.durata + " minuti");
			}
			
		}
	}
	
	public void aggiungiChiamata(String num, int durata) {
		for(int i = 0; i < chiamate.length; i++) {
			if(chiamate[i] == null) {
				chiamate[i] = new Chiamata(num, durata);
				break;
			}
			
		}
	}
	
	public void ricarica(double ricarica) {
		this.credito += ricarica;
	}
}
