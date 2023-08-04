package gestioneDispositiviAziendali.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioneDispositiviAziendali.entities.Utente;
import gestioneDispositiviAziendali.repository.UtenteRepository;

@Service
public class UtenteService {
	
	@Autowired
	private UtenteRepository ur;
	
	// ----------------------------------------------------salvataggio utente
	public Utente save(Utente utente) {
		ur.save(utente);
		return utente;
	}
	
	// ----------------------------------------------------fetch di tutti gli utenti
	public List<Utente> getUtenti(){
		return ur.findAll();
	}
}
