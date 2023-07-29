package gestionePrenotazioni.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionePrenotazioni.entities.Postazione;

@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository ur;
	
	public void salvaPostazione(Postazione u) {
		ur.save(u);
		System.out.println("Postazione salvata con successo.");
	}
	
	public Optional<Postazione> getById(int id){
		return ur.findById(id);
	}
	
}
