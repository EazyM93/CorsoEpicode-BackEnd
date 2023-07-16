package catalogo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import dao.CatalogoDAO;
import entities.Genere;
import entities.Libro;
import entities.Periodicità;
import entities.Rivista;
import entities.Utente;
import jpautil.JpaUtil;

public class Catalogo {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	
	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		CatalogoDAO cat = new CatalogoDAO(em);
		
		// adding new books
		cat.salvataggioLettura(new Libro(2134569041253L, "Ciclo Della Fondazione", 1958, 1345, "Asimov", Genere.Scifi));
		cat.salvataggioLettura(new Libro(3434569041253L, "Io Robot", 1968, 345, "Asimov", Genere.Scifi));
		cat.salvataggioLettura(new Libro(1567969041253L, "It", 1958, 1345, "Stephen King", Genere.Horror));
		
		// adding magazines
		cat.salvataggioLettura(new Rivista(7850969041253L, "Vanity Fair", 2005, 47, Periodicità.Mensile));
		cat.salvataggioLettura(new Rivista(9999569041253L, "Topolino 500", 2016, 67, Periodicità.Settimanale));
		
		//adding users
		cat.salvataggioUtente(new Utente(135502L, "Manuel", "Centini", LocalDate.of(1993, 10, 19)));
		cat.salvataggioUtente(new Utente(125602L, "Luca", "Giacalone", LocalDate.of(1993, 05, 20)));
		
	}

}
