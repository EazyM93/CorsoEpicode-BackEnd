package gestionePrenotazioni;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.entities.Prenotazione;
import gestionePrenotazioni.entities.Utente;
import gestionePrenotazioni.enums.TipologiaPostazione;
import gestionePrenotazioni.services.EdificioService;
import gestionePrenotazioni.services.PostazioneService;
import gestionePrenotazioni.services.PrenotazioneService;
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
    @Autowired
	PrenotazioneService prenS;
    
    // ------------------------------------------------Runnable------------------------------------------------
	@Override
	public void run(String... args) throws Exception {
	
		// ------------------------------------------------creazione & salvataggio edificio 
		es.salvaEdificio(es.costruisciEdificio("Primo Palazzo", "Via Maremma 37", "Roma"));
		
		// ------------------------------------------------creazione & salvataggio utente
		us.salvaUtente(us.creaUtente("Ajeje", "Ajeje Brazorf", "ajezorf@gmail.com"));
	
		// ------------------------------------------------creazione & salvataggio postazione
		Edificio ed = es.getById(1);
		ps.salvaPostazione(ps.creaPostazione("Stanza uno", TipologiaPostazione.PRIVATO, 3, ed));
		
		// ------------------------------------------------creazione & salvataggio prenotazione
		Utente utenteCorrente = us.getById(1);
		Postazione postazioneDaPrenotare = ps.getById(1);
		Prenotazione prenotazioneCorrente = prenS.creaPrenotazione(LocalDate.of(2023, 10, 12), utenteCorrente, postazioneDaPrenotare);
		prenS.salvaPrenotazione(prenotazioneCorrente);
		
		// ------------------------------------------------cerca per tipo e città
		TipologiaPostazione tipologiaCercata = TipologiaPostazione.PRIVATO;
		String cityCercata = "Roma";
		
		List<Postazione> listaPostazioni = ps.findByTipoAndCity(tipologiaCercata, cityCercata);
		
		if(listaPostazioni.isEmpty()) {
			System.out.printf("Nessuna postazione %s trovata a %s\n", tipologiaCercata.toString(), cityCercata);
		}else {
			System.out.printf("Elenco postazioni % a %s\n", tipologiaCercata.toString(), cityCercata);
			for(Postazione p: listaPostazioni) {
				System.out.printf("- %s", p.getDescrizione());
			}
		}
		
	}
    
	
}
