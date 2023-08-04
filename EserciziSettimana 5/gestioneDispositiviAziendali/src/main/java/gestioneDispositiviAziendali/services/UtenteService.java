package gestioneDispositiviAziendali.services;

import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.UUID;

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
	
	// ----------------------------------------------------fetch utente per id
	public Optional<Utente> findById(UUID id) {
		Utente utenteTrovato = null;
		
		for(Utente u: getUtenti())
			if(u.getId_utente().equals(id))
				utenteTrovato = u;
		
		return Optional.ofNullable(utenteTrovato);
 	}
	
	// ----------------------------------------------------cancellazione utente
	public void findByIdAndDelete(UUID id) {
		ListIterator<Utente> iterator = getUtenti().listIterator();

		while (iterator.hasNext()) {
			Utente utenteCorrente = iterator.next();
			if (utenteCorrente.getId_utente().equals(id)) iterator.remove();
		}
	}
	
}
