package gestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gestionePrenotazioni.config.GestionaleConfiguration;
import gestionePrenotazioni.dao.EdificioService;
import gestionePrenotazioni.dao.PostazioneService;
import gestionePrenotazioni.dao.UtenteService;
import gestionePrenotazioni.enums.TipologiaPostazione;

@Component
public class GestionaleRunner implements CommandLineRunner{

	// ------------------------------------------------creazione dei service 
    @Autowired
	EdificioService es;
    @Autowired
    UtenteService us;
    @Autowired
    PostazioneService ps;
    
    // ------------------------------------------------creazione config
    @Autowired
    private GestionaleConfiguration config;
    
    // ------------------------------------------------Runnable------------------------------------------------
	@Override
	public void run(String... args) throws Exception {
	
		// ------------------------------------------------creazione & salvataggio edificio 
		es.salvaEdificio(config
				.newEdificio("Palazzo Rosso", "Via Rossa 42", "Roma"));
		
		// ------------------------------------------------creazione & salvataggio utente
		us.salvaUtente(config
				.newUtente("Ajeje", "Ajeje Brazorf", "ajezorf@gmail.com"));
		
		// ------------------------------------------------creazione & salvataggio
		ps.salvaPostazione(config
				.newPostazione("Stanza uno", TipologiaPostazione.PRIVATO, 3, es.getById(1)));
	}
    
	
}
