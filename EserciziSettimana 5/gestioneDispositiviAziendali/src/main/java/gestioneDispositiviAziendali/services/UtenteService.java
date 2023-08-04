package gestioneDispositiviAziendali.services;

import org.springframework.stereotype.Service;

import gestioneDispositiviAziendali.entities.Utente;

@Service
public class UtenteService {
	
	// ----------------------------------------------------salvataggio utente
	public Utente save(Utente utente) {
		return utente;
	}
	
}
