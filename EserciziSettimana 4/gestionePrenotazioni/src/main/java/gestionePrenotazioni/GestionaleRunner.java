package gestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import gestionePrenotazioni.config.GestionaleConfiguration;
import gestionePrenotazioni.dao.EdificioService;
import gestionePrenotazioni.dao.UtenteService;
import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Utente;

@Component
public class GestionaleRunner implements CommandLineRunner{

	// ------------------------------------------------creazione dei service 
    @Autowired
	EdificioService es;
    @Autowired
    UtenteService us;
    
    // ------------------------------------------------creazione ctx
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(GestionaleConfiguration.class);
    
	@Override
	public void run(String... args) throws Exception {
	
		// ------------------------------------------------creazione & salvataggio edificio 
		es.salvaEdificio(Edificio.builder()
				.nomeEdificio("Palazzo Rosso")
				.indirizzo("Via Rossa 42")
				.city("Roma")
				.build());
		
		// ------------------------------------------------creazione & salvataggio utente
		
	}
    
	// ------------------------------------------------creazione & salvataggio utente
	public Utente inserisciUtente(String username, String nome, String email) {
		Utente u = (Utente) ctx.getBean("u");
		u.setUsername(username);
		u.setNomeCompleto(nome);
		u.setEmail(email);
		us.salvaUtente(u);
		return u;
	}
	
}
