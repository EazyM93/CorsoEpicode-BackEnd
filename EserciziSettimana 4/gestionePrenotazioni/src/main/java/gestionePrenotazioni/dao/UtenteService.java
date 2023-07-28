package gestionePrenotazioni.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionePrenotazioni.entities.Utente;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository ur;
	
	public void salvaUtente(Utente u) {
		ur.save(u);
		System.out.println("Utente salvato con successo.");
	}
	
	public Optional<Utente> getById(int id){
		return ur.findById(id);
	}
	
}
