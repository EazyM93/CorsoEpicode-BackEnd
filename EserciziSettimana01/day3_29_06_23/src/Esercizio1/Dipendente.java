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
	private double getStipendioBase() {
		return this.stipendioBase;
	}
	
	private String getMatricola() {
		return this.matricola;
	}
	
	private double getStipendio() {
		return this.stipendio;
	}
	
	public double getImportoOrarioStraordinario() {
		return this.importoOrarioStraordinario;
	}
	
	private Livello getLivello() {
		return this.livello;
	}
	
	public Dipartimento getDipartimento() {
		return this.dipartimento;
	}
	
	// SETTERS ------------------------------------------------
	public double setStipendio(double aumento) {
		return this.getStipendioBase() * aumento;
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
				this.stipendio = this.stipendioBase * 1.2;
				this.importoOrarioStraordinario = 40;
				System.out.println("Il dipendente con matricola " + this.matricola + " è stato promosso a: " + this.livello);
				break;
			case IMPIEGATO:
				this.livello = Livello.QUADRO;
				this.stipendio = this.stipendioBase * 1.5;
				this.importoOrarioStraordinario = 50;
				System.out.println("Il dipendente con matricola " + this.matricola + " è stato promosso a: " + this.livello);
				break;
			case QUADRO:
				this.livello = Livello.DIRIGENTE;
				this.stipendio = this.stipendioBase * 2;
				this.importoOrarioStraordinario = 100;
				System.out.println("Il dipendente con matricola " + this.matricola + " è stato promosso a: " + this.livello);
				break;
			case DIRIGENTE:
				System.out.println("Il dipendente con matricola " + this.matricola + " è già in cima alla catena alimentare!");
				break;
			default:
				System.out.println("Qualcosa è andato storto! Errore di sistema");
		}
		
		System.out.println();
	}
	
	// CALCOLO PAGA
	public static double calcoloPaga(Dipendente dip) {
		return dip.getStipendio();
	}
	
	public static double calcoloPaga(Dipendente dip, int oreStraordinario) {
		return dip.getStipendio() + (dip.getImportoOrarioStraordinario() * oreStraordinario);
	}
	
}
