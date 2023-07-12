package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import entities.Evento;
import entities.EventoDAO;
import entities.Location;
import entities.LocationDAO;
import entities.Partecipazione;
import entities.PartecipazioneDAO;
import entities.Persona;
import entities.PersonaDAO;
import entities.Sesso;
import entities.Stato;
import entities.TipoEvento;
import util.JpaUtil;

public class GestioneEventi {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		// dao variables
		PersonaDAO pd = new PersonaDAO(em);
		LocationDAO ld = new LocationDAO(em);
		EventoDAO sd = new EventoDAO(em);
		PartecipazioneDAO pard = new PartecipazioneDAO(em);
		
		// person save
		Persona manuel = new Persona("Manuel", "Centini", "manuel@gmail.com", "1993-10-19", Sesso.Maschio);
		pd.save(manuel);
		System.out.println();
		
		// location save
		Location laghetto = new Location("Laghetto", "Roma");
		ld.save(laghetto);
		System.out.println();
		
		// event save
		Evento meet = new Evento("Meet Up Epicode", "2023-07-14", "Meet tra epicoders.", TipoEvento.Pubblico, 100, laghetto);
		sd.save(meet);
		System.out.println();
		
		// partecipazione save
		Partecipazione prima = new Partecipazione(manuel, meet, Stato.Confermato);
		pard.save(prima);
		System.out.println();

		em.close();
		emf.close();
	}

}
