package day1_01_08_23.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day1_01_08_23.entities.Prenotazione;
import day1_01_08_23.payloads.NewPostazioneBody;

@Service
public class PrenotazioneService {

	private List<Prenotazione> prenotazioni = new ArrayList<>();
	
	@Autowired
	UtenteService us;
	
	@Autowired
	PostazioneService ps;
	
	// ----------------------------------------------------salvataggio prenotazione
	public Prenotazione save(NewPostazioneBody newBody) {
		
		// costruzione prenotazione dal body
		Prenotazione p = Prenotazione.builder()
				.id_prenotazione(Math.abs(new Random().nextInt()))
				.dataPrenotazione(newBody.getDate())
				.utente(us.findById(newBody.getId_utente()).get())
				.postazione(ps.findById(newBody.getId_postazione()).get())
				.build();
		
		this.prenotazioni.add(p);
		
		return p;
	}
	
	// ----------------------------------------------------ritorna lista di prenotazioni
		public List<Prenotazione> getPrenotazioni(){
			return this.prenotazioni;
		}
	
}
