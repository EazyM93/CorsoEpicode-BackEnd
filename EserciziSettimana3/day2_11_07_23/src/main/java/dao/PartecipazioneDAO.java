package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Partecipazione;

public class PartecipazioneDAO {

	private final EntityManager em;

	public PartecipazioneDAO(EntityManager em) {this.em = em;}
	
	public void save(Partecipazione partecipazione) {
		EntityTransaction t = em.getTransaction();

		t.begin(); 

		em.persist(partecipazione);		

		t.commit();
		
		System.out.println("Partecipazione salvata con successo");
	}
	
	public Partecipazione findById(UUID id) {
		
		Partecipazione found = em.find(Partecipazione.class, id);
		
		return found;
	}
	
	public void findByIdAndDelete(UUID id) {
		
		Partecipazione found = em.find(Partecipazione.class, id);
		if (found != null) {
			
			EntityTransaction t = em.getTransaction();

			t.begin();

			em.remove(found);
			
			t.commit();
			
			System.out.println("Partecipazione eliminata con successo");
			
		} else System.out.println("Partecipazione non trovata");
	}
	
	public void refresh(UUID id) {
		
		Partecipazione found = em.find(Partecipazione.class, id);

		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);
		
		System.out.println("POST REFRESH");
		System.out.println(found);

	}
	
}
