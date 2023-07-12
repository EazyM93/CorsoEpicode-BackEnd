package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import entities.Evento;
import entities.EventoDAO;
import entities.Location;
import entities.TipoEvento;
import util.JpaUtil;

public class GestioneEventi {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		EventoDAO sv = new EventoDAO(em);
		
		// save
		Location laghetto = new Location("Laghetto", "Roma");
		Evento meet = new Evento("Meet Up Epicode", "2023-07-14", "Meet tra epicoders.", TipoEvento.Pubblico, 100, laghetto);
		sv.save(meet);
		System.out.println();
		
		Evento lezione = new Evento("Lezione Epicode", "2023-07-12", "Lezione di domani.", TipoEvento.Privato, 30, laghetto);
		sv.save(lezione);
		System.out.println();

		// find by id
		System.out.println(sv.findById(meet.getId()));
		System.out.println();
		System.out.println(sv.findById(lezione.getId()));
		System.out.println();
		
		// delete
		sv.findByIdAndDelete(lezione.getId());
		System.out.println();

		em.close();
		emf.close();
	}

}
