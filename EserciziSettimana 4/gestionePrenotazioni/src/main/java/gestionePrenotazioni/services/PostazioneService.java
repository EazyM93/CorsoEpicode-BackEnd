package gestionePrenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.enums.TipologiaPostazione;
import gestionePrenotazioni.repository.PostazioneRepository;

@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository pr;
	
	public Postazione creaPostazione(String descrizione, TipologiaPostazione tipo, int occupantiMax, Edificio edificio) {
		return Postazione.builder()
				.descrizione(descrizione)
				.tipo(tipo)
				.numerooccupantimax(occupantiMax)
				.edificio(edificio)
				.build();
	}
	
	public void salvaPostazione(Postazione u) {
		pr.save(u);
		System.out.println("Postazione salvata con successo.");
	}
	
	public Postazione getById(int id){
		return pr.findById(id).get();
	}
	
	public List<Postazione> findByTipoAndCity(TipologiaPostazione tipo, String city){
		return pr.findByTipoAndCity(tipo, city);
	}
	
}
