package gestionePrenotazioni.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionePrenotazioni.entities.Utente;
import gestionePrenotazioni.repository.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository ur;
	
	public Utente creaUtente(String username, String nomeCompleto, String email) {
		return Utente.builder()
				.username(username)
				.nomeCompleto(nomeCompleto)
				.email(email)
				.build();
	}
	
	public void salvaUtente(Utente u) {
		ur.save(u);
		System.out.println("Utente salvato con successo.");
	}
	
	public Utente getById(int id){
		return ur.findById(id).get();
	}
	
}
