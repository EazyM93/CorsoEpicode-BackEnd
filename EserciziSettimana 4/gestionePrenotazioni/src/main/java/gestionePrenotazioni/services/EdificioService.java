package gestionePrenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.repository.EdificioRepository;

@Service
public class EdificioService {
	
	@Autowired
	private EdificioRepository ed;
	
	public Edificio costruisciEdificio(String nome, String indirizzo, String city) {
		return Edificio.builder()
				.nomeEdificio(nome)
				.indirizzo(indirizzo)
				.city(city)
				.build();
	}
	
	public void salvaEdificio(Edificio e) {
		ed.save(e);
		System.out.println("Edificio salvato con successo.");
	}
	
	public Edificio getById(int id){
		return ed.findById(id).get();
	}

}
