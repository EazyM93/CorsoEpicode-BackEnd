package app;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import entities.Evento;
import entities.EventoDAO;
import entities.TipoEvento;
import util.JpaUtil;

public class GestioneEventi {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		EventoDAO sv = new EventoDAO(em);
		
		// save
		Evento meet = new Evento("Meet Up Epicode", "2023-07-14", "Meet tra epicoders.", TipoEvento.Pubblico, 100);
		sv.save(meet);
		System.out.println();

		// find by id
		System.out.println(sv.findById(meet.getId()));
		
	}

}
