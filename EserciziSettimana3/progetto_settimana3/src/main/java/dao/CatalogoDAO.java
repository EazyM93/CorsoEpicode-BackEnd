package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

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
			
			System.out.println((found instanceof Libro)? "Libro eliminato con successo" : "Rivista eliminato con successo");
			
		} else System.out.println("Elemento non presente nel catalogo");
	}
	
	public List<Lettura> findYear(int anno) {
		TypedQuery<Lettura> query = em.createQuery("SELECT l FROM Lettura l WHERE l.anno = :anno",
				Lettura.class);
		query.setParameter("anno", anno);
		return query.getResultList();
	}
	
	public List<Lettura> findAuthor(String autore) {
		TypedQuery<Lettura> query = em.createQuery("SELECT lib FROM Libro lib WHERE lib.autore = :autore", Lettura.class);
		query.setParameter("autore", autore);

		return query.getResultList();
	}
	
	public List<Lettura> findTitle(String titolo) {
		TypedQuery<Lettura> query = em.createQuery("SELECT l FROM Lettura l WHERE l.titolo LIKE :titolo",
				Lettura.class);
		query.setParameter("titolo", "%" + titolo + "%");

		return query.getResultList();
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
