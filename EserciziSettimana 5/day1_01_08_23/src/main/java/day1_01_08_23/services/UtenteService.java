package day1_01_08_23.services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import day1_01_08_23.entities.Utente;

@Service
public class UtenteService {

	private List<Utente> utenti = new ArrayList<>();
	
	// ----------------------------------------------------salvataggio utente
	public Utente save(Utente utente) {
		utente.setId_utente(Math.abs(new Random().nextInt()));
		this.utenti.add(utente);
		return utente;
	}
	
	// ----------------------------------------------------ritorna lista di utenti
	public List<Utente> getUtenti(){
		return this.utenti;
	}
	
	// ----------------------------------------------------cerca utente per id
	public Optional<Utente> findById(int id) {
		Utente u = null;

		for (Utente utenteCorrente : utenti) {
			if (utenteCorrente.getId_utente() == id)
				u = utenteCorrente;
		}

		return Optional.ofNullable(u);
	}
	
	// ----------------------------------------------------elimina utente tramite id
	public void findByIdAndDelete(int id) {
		ListIterator<Utente> iterator = this.utenti.listIterator();

		while (iterator.hasNext()) {
			Utente utenteCorrente = iterator.next();
			if (utenteCorrente.getId_utente() == id) iterator.remove();
		}
	}

	// ----------------------------------------------------aggiorna utente tramite id
	public Optional<Utente> findByIdAndUpdate(int id, Utente u) {
		Utente found = null;

		for (Utente utenteCorrente : utenti) {
			if (utenteCorrente.getId_utente() == id) {
				found = utenteCorrente;
				found.setUsername(u.getUsername());
				found.setNomeCompleto(u.getNomeCompleto());
				found.setEmail(u.getEmail());
				found.setId_utente(id);
			}
		}
		
		return Optional.ofNullable(found);

	}
}
