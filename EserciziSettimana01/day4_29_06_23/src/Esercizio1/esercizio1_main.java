package Esercizio1;

public class esercizio1_main {

	public static void main(String[] args) {
		
		Dipendente luca = new Dipendente("0001", Dipartimento.VENDITE);
		
		luca.stampaDatiDipendente();
		luca.promuovi();
		luca.promuovi();
		luca.promuovi();
		luca.promuovi();
		luca.stampaDatiDipendente();
		System.out.println("Stipendio del mese corrente senza straordinari: " + Dipendente.calcoloPaga(luca));
		System.out.println("Stipendio del mese corrente con straordinari: " + Dipendente.calcoloPaga(luca, 20));
		System.out.println();
		
		Dipendente manuel = new Dipendente("0002", Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		
		manuel.stampaDatiDipendente();
		manuel.promuovi();
		manuel.stampaDatiDipendente();
		System.out.println("Stipendio del mese corrente senza straordinari: " + Dipendente.calcoloPaga(manuel));
		System.out.println("Stipendio del mese corrente con straordinari: " + Dipendente.calcoloPaga(manuel, 20));
		System.out.println();
	}
	
}
