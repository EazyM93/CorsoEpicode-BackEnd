package catalogo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import dao.CatalogoDAO;
import entities.Genere;
import entities.Lettura;
import entities.Libro;
import entities.Periodicità;
import entities.Prestito;
import entities.Rivista;
import entities.Utente;
import jpautil.JpaUtil;

public class Catalogo {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	
	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		CatalogoDAO cat = new CatalogoDAO(em);
		
		// adding new books
		Libro bookOne = new Libro(2134569041253L, "Ciclo Della Fondazione", 1958, 1345, "Asimov", Genere.Scifi);
		cat.salvataggioLettura(bookOne);
		Libro bookTwo = new Libro(3434569041253L, "Io Robot", 1968, 345, "Asimov", Genere.Scifi);
		cat.salvataggioLettura(bookTwo);
		Libro bookThree = new Libro(1567969041253L, "It", 1958, 1345, "Stephen King", Genere.Horror);
		cat.salvataggioLettura(bookThree);
		
		// adding magazines
		Rivista magazineOne = new Rivista(7850969041253L, "Vanity Fair", 2005, 47, Periodicità.Mensile);
		cat.salvataggioLettura(magazineOne);
		Rivista magazineTwo = new Rivista(9999569041253L, "Topolino 500", 2016, 67, Periodicità.Settimanale);
		cat.salvataggioLettura(magazineTwo);
		
		//adding users
		Utente userOne = new Utente(135502L, "Manuel", "Centini", LocalDate.of(1993, 10, 19));
		cat.salvataggioUtente(userOne);
		Utente userTwo = new Utente(125602L, "Luca", "Giacalone", LocalDate.of(1993, 05, 20));
		cat.salvataggioUtente(userTwo);
		
		// search by isbn
		System.out.println();
		System.out.println(cat.findByIsbn(2134569041253L).toString());
		System.out.println(cat.findByIsbn(7850969041253L).toString());
		System.out.println();
		
		// delete by isbn
		cat.findByIdAndDelete(9999569041253L);
		cat.findByIdAndDelete(1567969041253L);
		System.out.println();
		
		// search by year
		System.out.println("Letture anno selezionato");
		cat.findYear(1958).forEach(lettura -> System.out.println("- " + lettura.getTitolo()));
		System.out.println();
		
		// search Author
		System.out.println("Letture autore selezionato");
		cat.findAuthor("Asimov").forEach(lettura -> System.out.println("- " + lettura.getTitolo()));
		System.out.println();
		
		// search by title
		System.err.println(cat.findTitle("Io Robot"));
		System.out.println();
		
		// salvataggio prestito
		Prestito prestitoOne = new Prestito(userOne, bookOne, LocalDate.of(2023, 06, 20), LocalDate.of(2023, 07, 15), LocalDate.of(2023, 07, 15));
		
		// ricerca prestiti per scheda utente
		System.out.println("Letture in prestito all'utente selezionato");
		cat.findUserCard(135502L).forEach(lettura -> System.out.println("- " + lettura.getLettura().getTitolo()));
		System.out.println();
		
		// ricerca prestiti scaduti
		System.out.println("Prestiti scaduti");
		cat.findElapsed().forEach(lettura -> System.out.println("- " + lettura.getLettura().getTitolo() + " in prestito a " + lettura.getUtente().getNome() + lettura.getUtente().getCognome()));
		System.out.println();
				
	}

}
