package gestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gestionePrenotazioni.config.GestionaleConfiguration;
import gestionePrenotazioni.dao.EdificioService;
import gestionePrenotazioni.dao.PostazioneService;
import gestionePrenotazioni.dao.UtenteService;
import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.entities.Utente;
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
		Edificio e = config.newEdificio();
		e.setNomeEdificio("Primo Palazzo");
		e.setIndirizzo("Via Maremma 37");
		e.setCity("Roma");
		es.salvaEdificio(e);
		
		// ------------------------------------------------creazione & salvataggio utente
		Utente u = config.newUtente();
		u.setUsername("Ajeje");
		u.setNomeCompleto("Ajeje Brazorf");
		u.setEmail("ajezorf@gmail.com");
		us.salvaUtente(u);
	
		// ------------------------------------------------creazione & salvataggio
		Postazione p = config.newPostazione();
		p.setDescrizione("Stanza uno");
		p.setTipo(TipologiaPostazione.PRIVATO);
		p.setNumerooccupantimax(3);
		p.setEdificio(es.getById(1).get());
		ps.salvaPostazione(p);
	}
    
	
}
