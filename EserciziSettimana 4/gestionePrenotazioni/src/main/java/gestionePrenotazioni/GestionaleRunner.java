package gestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

	@Override
	public void run(String... args) throws Exception {
	
		// ------------------------------------------------creazione & salvataggio edificio 
		es.salvaEdificio(Edificio.builder()
				.nomeEdificio("Palazzo Rosso")
				.indirizzo("Via Rossa 42")
				.city("Roma")
				.build());
		
		// ------------------------------------------------creazione & salvataggio utente
		us.salvaUtente(Utente.builder()
				.username("Ajeje")
				.nomeCompleto("Ajeje Brazorf")
				.email("ajezorf@gmail.com")
				.build());
	}
    
    
	
}
