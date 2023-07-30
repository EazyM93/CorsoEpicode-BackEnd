package gestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gestionePrenotazioni.config.GestionaleConfiguration;
import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.entities.Utente;
import gestionePrenotazioni.enums.TipologiaPostazione;
import gestionePrenotazioni.services.EdificioService;
import gestionePrenotazioni.services.PostazioneService;
import gestionePrenotazioni.services.UtenteService;

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
		es.salvaEdificio(
				es.costruisciEdificio("Primo Palazzo", "Via Maremma 37", "Roma")
				);
		
		// ------------------------------------------------creazione & salvataggio utente
		us.salvaUtente(
				us.creaUtente("Ajeje", "Ajeje Brazorf", "ajezorf@gmail.com")
				);
	
		// ------------------------------------------------creazione & salvataggio postazione
		Edificio ed = es.getById(1);
		ps.salvaPostazione(
				ps.creaPostazione("Stanza uno", TipologiaPostazione.PRIVATO, 3, ed)
				);
		
		
		
	}
    
	
}
