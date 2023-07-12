package entities;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LocationDAO {

	private final EntityManager em;

	public LocationDAO(EntityManager em) {this.em = em;}
	
	public void save(Location location) {
		EntityTransaction t = em.getTransaction();

		t.begin(); 

		em.persist(location);		

		t.commit();
		
		System.out.println("Location salvata con successo");
	}
	
	public Location findById(UUID id) {
		
		Location found = em.find(Location.class, id);
		
		return found;
	}
	
	public void findByIdAndDelete(UUID id) {
		
		Location found = em.find(Location.class, id);
		if (found != null) {
			
			EntityTransaction t = em.getTransaction();

			t.begin();

			em.remove(found);
			
			t.commit();
			
			System.out.println("Location eliminata con successo");
			
		} else System.out.println("Location non trovata");
	}
	
	public void refresh(UUID id) {
		
		Location found = em.find(Location.class, id);
		
		found.setNome("Dadegi");

		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);
		
		System.out.println("POST REFRESH");
		System.out.println(found);

	}
	
}
