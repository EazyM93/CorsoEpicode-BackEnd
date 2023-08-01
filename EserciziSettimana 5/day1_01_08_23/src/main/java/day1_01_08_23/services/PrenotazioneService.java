package day1_01_08_23.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import day1_01_08_23.entities.Prenotazione;

@Service
public class PrenotazioneService {

	private List<Prenotazione> prenotazioni = new ArrayList<>();
	
	// ----------------------------------------------------salvataggio prenotazione
	public Prenotazione save(Prenotazione prenotazione) {
		prenotazione.setId_prenotazione(Math.abs(new Random().nextInt()));
		this.prenotazioni.add(prenotazione);
		return prenotazione;
	}
	
}
