package dao;

import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entities.Concerto;
import entities.Evento;
import entities.Genere;

public class EventoDAO {

	private final EntityManager em;

	public EventoDAO(EntityManager em) {this.em = em;}
	
	public void save(Evento e) {
		EntityTransaction t = em.getTransaction();

		t.begin(); 

		em.persist(e);		

		t.commit();
		
		System.out.println("Evento salvato con successo");
	}
	
	public Evento findById(UUID id) {
		
		Evento found = em.find(Evento.class, id);
		
		return found;
	}
	
	public void findByIdAndDelete(UUID id) {
		
		Evento found = em.find(Evento.class, id);
		if (found != null) {
			
			EntityTransaction t = em.getTransaction();

			t.begin();

			em.remove(found);
			
			t.commit();
			
			System.out.println("Evento eliminato con successo");
			
		} else System.out.println("Evento non trovato");
	}
	
	public void refresh(UUID id) {
		
		Evento found = em.find(Evento.class, id);
		
		found.setTitolo("Dadegi");

		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);
		
		System.out.println("POST REFRESH");
		System.out.println(found);

	}
	
	public List<Concerto> getConcertiInStreaming(boolean b) {
		TypedQuery<Concerto> getAllQuery = 
				em.createQuery("SELECT co FROM Concerto co WHERE inStreaming = true",
						Concerto.class);
		return getAllQuery.getResultList();
	}
	
	public List<Concerto> getConcertiPerGenere(Genere genere) {
		TypedQuery<Concerto> getAllQuery = 
				em.createQuery("SELECT co FROM Concerto co WHERE genere = :genere",
						Concerto.class);
		return getAllQuery.getResultList();
	}
	
}
