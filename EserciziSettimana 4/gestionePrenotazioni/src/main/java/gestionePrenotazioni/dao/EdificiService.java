package gestionePrenotazioni.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionePrenotazioni.entities.Edificio;

@Service
public class EdificiService {
	
	@Autowired
	private EdificioRepository ed;
	
	public void salvaEdificio(Edificio e) {
		ed.save(e);
		System.out.println("Edificio salvato con successo.");
	}
	
	public Optional<Edificio> getById(int id){
		return ed.findById(id);
	}

}
