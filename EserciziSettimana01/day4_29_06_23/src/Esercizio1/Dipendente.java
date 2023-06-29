package Esercizio1;

public class Dipendente {

	private double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	// COSTRUTTORI ------------------------------------------------
	Dipendente(String _matricola, Dipartimento _dipartimento) {
		this.matricola = _matricola;
		this.dipartimento = _dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	};
	
	Dipendente(String _matricola, Livello _livello, Dipartimento _dipartimento){
		this.matricola = _matricola;
		this.dipartimento = _dipartimento;
		this.stipendio = generaStipendio(_livello);
		this.livello = _livello;
	};
	
	// GETTER ------------------------------------------------
	public double getStipendioBase() {
		return this.stipendioBase;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	public double getStipendio() {
		return this.stipendio;
	}
	
	public double getImportoOrarioStraordinario() {
		return this.importoOrarioStraordinario;
	}
	
	public Livello getLivello() {
		return this.livello;
	}
	
	public Dipartimento getDipartimento() {
		return this.dipartimento;
	}
	
	// SETTERS ------------------------------------------------
	public double setStipendio(double aumento) {
		return getStipendioBase() * aumento;
	}
	
	public void setImportoOrarioStraordinario(double nuovoImporto) {
		this.importoOrarioStraordinario = nuovoImporto;
	}
	
	// METODI ------------------------------------------------
	
	// CALCOLA STIPENDIO IN BASE AL LIVELLO 
	private double generaStipendio(Livello liv) {
		
		double stipendio = 0;
		
		switch(liv) {
			case OPERAIO:
				stipendio = this.getStipendioBase();
				break;
			case IMPIEGATO:
				stipendio = setStipendio(1.2);
				setImportoOrarioStraordinario(40);
				break;
			case QUADRO:
				stipendio = setStipendio(1.5);
				setImportoOrarioStraordinario(50);
				break;
			case DIRIGENTE:
				stipendio = setStipendio(2);
				setImportoOrarioStraordinario(100);
				break;
			default:
				System.out.println("Qualcosa è andato storto! Errore di sistema");
		}
		
		return stipendio;
	}
	
	// STAMPA DATI
	public void stampaDatiDipendente() {
		System.out.println("La matricola è : " + this.getMatricola());
		System.out.println("Il livello è : " + this.getLivello());
		System.out.println("Il dipartimento è : " + this.getDipartimento());
		System.out.println("L' importo Orario Straordinario è : " + this.getImportoOrarioStraordinario());
		System.out.println("Lo stipendio è : " + this.getStipendio());
		System.out.println();
	}
	
	// PROMOZIONE
	public void promuovi() {
		switch(this.getLivello()) {
			case OPERAIO:
				this.livello = Livello.IMPIEGATO;
				stipendio = setStipendio(1.2);
				setImportoOrarioStraordinario(40);
				System.out.println("Il dipendente con matricola " + getMatricola() + " è stato promosso a: " + getLivello());
				break;
			case IMPIEGATO:
				this.livello = Livello.QUADRO;
				stipendio = setStipendio(1.5);
				setImportoOrarioStraordinario(50);
				System.out.println("Il dipendente con matricola " + getMatricola() + " è stato promosso a: " + getLivello());
				break;
			case QUADRO:
				this.livello = Livello.DIRIGENTE;
				stipendio = setStipendio(2);
				setImportoOrarioStraordinario(100);
				System.out.println("Il dipendente con matricola " + getMatricola() + " è stato promosso a: " + getLivello());
				break;
			case DIRIGENTE:
				System.out.println("Il dipendente con matricola " + getMatricola() + " è già in cima alla catena alimentare!");
				break;
			default:
				System.out.println("Qualcosa è andato storto! Errore di sistema");
		}
		
		System.out.println();
	}
	
	// CALCOLO PAGA
	public static void calcoloPaga(Dipendente dip) {
		System.out.println("Lo stipendio del mese corrente è della matricola " + dip.getMatricola() + " è: " + dip.getStipendio());
	}
	
	public static void calcoloPaga(Dipendente dip, int oreStraordinario) {
		System.out.println("Lo stipendio del mese corrente è della matricola " + dip.getMatricola() + " è: " + (dip.getStipendio() + (dip.getImportoOrarioStraordinario() * oreStraordinario)));
	}
	
}
