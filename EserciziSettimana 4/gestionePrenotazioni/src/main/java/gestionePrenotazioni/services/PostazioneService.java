package gestionePrenotazioni.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.enums.TipologiaPostazione;
import gestionePrenotazioni.repository.PostazioneRepository;

@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository ur;
	
	public Postazione creaPostazione(String descrizione, TipologiaPostazione tipo, int occupantiMax, Edificio edificio) {
		return Postazione.builder()
				.descrizione(descrizione)
				.tipo(tipo)
				.numerooccupantimax(occupantiMax)
				.edificio(edificio)
				.build();
	}
	
	public void salvaPostazione(Postazione u) {
		ur.save(u);
		System.out.println("Postazione salvata con successo.");
	}
	
	public Postazione getById(int id){
		return ur.findById(id).get();
	}
	
}
