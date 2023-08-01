package day1_01_08_23.services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import day1_01_08_23.entities.Postazione;

@Service
public class PostazioneService {

private List<Postazione> postazioni = new ArrayList<>();
	
	// ----------------------------------------------------salvataggio postazione
	public Postazione save(Postazione postazione) {
		postazione.setId_postazione(Math.abs(new Random().nextInt()));
		this.postazioni.add(postazione);
		return postazione;
	}
	
	// ----------------------------------------------------ritorna lista di postazione
	public List<Postazione> getPostazioni(){
		return this.postazioni;
	}
	
	// ----------------------------------------------------cerca postazione per id
	public Optional<Postazione> findById(int id) {
		Postazione u = null;

		for (Postazione postazioneCorrente : postazioni)
			if (postazioneCorrente.getId_postazione() == id) u = postazioneCorrente;

		return Optional.ofNullable(u);
	}
	
	// ----------------------------------------------------elimina postazione tramite id
	public void findByIdAndDelete(int id) {
		ListIterator<Postazione> iterator = this.postazioni.listIterator();

		while (iterator.hasNext()) {
			Postazione postazioneCorrente = iterator.next();
			if (postazioneCorrente.getId_postazione() == id) iterator.remove();
		}
	}

	// ----------------------------------------------------aggiorna postazione tramite id
	public Optional<Postazione> findByIdAndUpdate(int id, Postazione p) {
		Postazione found = null;

		for (Postazione postazioneCorrente : postazioni)
			if (postazioneCorrente.getId_postazione() == id) {
				found = postazioneCorrente;
				found.setDescrizione(p.getDescrizione());
				found.setNumeroOccupantiMax(p.getNumeroOccupantiMax());
				found.setTipo(p.getTipo());
				found.setCity(p.getCity());
				found.setId_postazione(id);
			}
		
		return Optional.ofNullable(found);

	}
	
}
