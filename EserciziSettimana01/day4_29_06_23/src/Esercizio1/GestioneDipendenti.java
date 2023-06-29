package Esercizio1;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		// due operai con il primo costruttore
		Dipendente manuel = new Dipendente("001", Dipartimento.PRODUZIONE);
		Dipendente luca = new Dipendente("002", Dipartimento.PRODUZIONE);
		
		// impiegato in amministrazione
		Dipendente flavio = new Dipendente("003", Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		
		// dirigente in vendite
		Dipendente giuseppe = new Dipendente("004", Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		luca.promuovi();
		flavio.promuovi();
		
		manuel.stampaDatiDipendente();
		luca.stampaDatiDipendente();
		flavio.stampaDatiDipendente();
		giuseppe.stampaDatiDipendente();
		
		Dipendente.calcoloPaga(manuel, 5);
		Dipendente.calcoloPaga(luca, 5);
		Dipendente.calcoloPaga(flavio, 5);
		Dipendente.calcoloPaga(giuseppe, 5);
	}
	
}
