package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Lettura;
import entities.Libro;
import entities.Prestito;
import entities.Utente;

public class CatalogoDAO {

	private final EntityManager em;

	public CatalogoDAO(EntityManager em) {this.em = em;}
	
	public void salvataggioLettura(Lettura lettura) {
		EntityTransaction t = em.getTransaction();

		t.begin(); 

		em.persist(lettura);		

		t.commit();
		
		System.out.println((lettura instanceof Libro)? "Libro salvato con successo" : "Rivista salvata con successo");
	}
	
	public void salvataggioUtente(Utente utente) {
		EntityTransaction t = em.getTransaction();

		t.begin(); 

		em.persist(utente);		

		t.commit();
		
		System.out.println("Utente salvato con successo");
	}
	
	public void salvataggioPrestito(Prestito s) {
		EntityTransaction t = em.getTransaction();
		t.begin();

		if (!em.contains(s.getLettura())) em.persist(s.getLettura());
		else em.persist(s);

		t.commit();
		System.out.println("Prestito salvato correttamente");
	}
	
	public Lettura findByIsbn(long isbn) {
		
		Lettura found = em.find(Lettura.class, isbn);
		
		if (found == null) System.out.println("Elemento inesistente o cancellato");
		
		return found;
		
	}
	
	public void findByIdAndDelete(long isbn) {
		
		Lettura found = em.find(Lettura.class, isbn);
		if (found != null) {
			
			EntityTransaction t = em.getTransaction();

			t.begin();

			em.remove(found);
			
			t.commit();
			
			System.out.println((found instanceof Libro)? "Libro salvato con successo" : "Rivista salvato con successo");
			
		} else System.out.println("Lettura non trovato");
	}
	
	public void refresh(long isbn) {
		
		Lettura found = em.find(Lettura.class, isbn);
		
		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);
		
		System.out.println("POST REFRESH");
		System.out.println(found);

	}
	
}
