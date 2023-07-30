package gestionePrenotazioni.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.entities.Prenotazione;
import gestionePrenotazioni.entities.Utente;
import gestionePrenotazioni.repository.PrenotazioniRepository;

@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioniRepository prenR;
	
	public Prenotazione creaPrenotazione(LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
		return Prenotazione.builder()
				.dataPrenotazione(dataPrenotazione)
				.dataFineSoggiorno(dataPrenotazione.plusDays(1))
				.utente(utente)
				.postazione(postazione)
				.build();
	}
	
	public void salvaPrenotazione(Prenotazione p) {
		LocalDate dp = p.getDataPrenotazione();
		Optional<Prenotazione> existingPrenotazione = prenR.findFirstByUtenteAndDataPrenotazione(p.getUtente(), dp);
		
		if(existingPrenotazione.isPresent()) System.out.println("Data non disponibile! Impossibile creare la prenotazione!");
		else {
			prenR.save(p);
			System.out.println("Prenotazione effettuata!");
		}		
	}
	
	public Prenotazione getById(int id){
		return prenR.findById(id).get();
	}
	
}
