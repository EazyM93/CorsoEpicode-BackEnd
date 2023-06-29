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
		this.stipendio = (generaValori(_livello))[0];
		this.importoOrarioStraordinario = (generaValori(_livello))[1];
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
	
	public double setImportoOrarioStraordinario(double nuovoImporto) {
		return nuovoImporto;
	}
	
	// METODI ------------------------------------------------
	
	// CALCOLA STIPENDIO IN BASE AL LIVELLO 
	private double[] generaValori(Livello liv) {
		
		double valoriGenerati[] = new double[2];
		
		switch(liv) {
			case OPERAIO:
				valoriGenerati[0] = this.getStipendioBase();
				valoriGenerati[1] = this.getImportoOrarioStraordinario();
				break;
			case IMPIEGATO:
				valoriGenerati[0] = setStipendio(1.2);
				valoriGenerati[1] = setImportoOrarioStraordinario(40);
				break;
			case QUADRO:
				valoriGenerati[0] = setStipendio(1.5);
				valoriGenerati[1] = setImportoOrarioStraordinario(50);
				break;
			case DIRIGENTE:
				valoriGenerati[0] = setStipendio(2);
				valoriGenerati[1] = setImportoOrarioStraordinario(100);
				break;
			default:
				System.out.println("Qualcosa è andato storto! Errore di sistema");
		}
		
		return valoriGenerati;
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
				this.stipendio = setStipendio(1.2);
				setImportoOrarioStraordinario(40);
				System.out.println("Il dipendente con matricola " + getMatricola() + " è stato promosso a: " + getLivello());
				break;
			case IMPIEGATO:
				this.livello = Livello.QUADRO;
				this.stipendio = setStipendio(1.5);
				setImportoOrarioStraordinario(50);
				System.out.println("Il dipendente con matricola " + getMatricola() + " è stato promosso a: " + getLivello());
				break;
			case QUADRO:
				this.livello = Livello.DIRIGENTE;
				this.stipendio = setStipendio(2);
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
