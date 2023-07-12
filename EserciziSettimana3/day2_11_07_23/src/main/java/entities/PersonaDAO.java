package entities;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonaDAO {

	private final EntityManager em;

	public PersonaDAO(EntityManager em) {this.em = em;}
	
	public void save(Persona persona) {
		EntityTransaction t = em.getTransaction();

		t.begin(); 

		em.persist(persona);		

		t.commit();
		
		System.out.println("Persona salvata con successo");
	}
	
	public Persona findById(UUID id) {
		
		Persona found = em.find(Persona.class, id);
		
		return found;
	}
	
	public void findByIdAndDelete(UUID id) {
		
		Persona found = em.find(Persona.class, id);
		if (found != null) {
			
			EntityTransaction t = em.getTransaction();

			t.begin();

			em.remove(found);
			
			t.commit();
			
			System.out.println("Persona eliminata con successo");
			
		} else System.out.println("Persona non trovata");
	}
	
	public void refresh(UUID id) {
		
		Persona found = em.find(Persona.class, id);
		
		found.setNome("Dadegi");

		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);
		
		System.out.println("POST REFRESH");
		System.out.println(found);

	}
	
}
