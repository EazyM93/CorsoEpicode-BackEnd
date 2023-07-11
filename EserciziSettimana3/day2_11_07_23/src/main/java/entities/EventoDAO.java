package entities;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDAO {

	private final EntityManager em;

	public EventoDAO(EntityManager em) {this.em = em;}
	
	public void save(Evento e) {
		EntityTransaction t = em.getTransaction();

		t.begin(); 

		em.persist(e);		

		t.commit();
		
		System.out.println("Studente salvato correttamente");
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
			
			System.out.println("Studente eliminato correttamente");
			
		} else System.out.println("Studente non trovato");
	}
	
	public void refresh(UUID id) {
		
		Evento found = em.find(Evento.class, id);

		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);
		
		System.out.println("POST REFRESH");
		System.out.println(found);

	}
	
}
