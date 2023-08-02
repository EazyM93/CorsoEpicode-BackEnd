package day1_01_08_23.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import day1_01_08_23.entities.Prenotazione;
import day1_01_08_23.enums.TipologiaPostazione;
import day1_01_08_23.payloads.NewPostazioneBody;
import day1_01_08_23.services.PrenotazioneService;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

	@Autowired
	PrenotazioneService ps;

	
	// ---------------------------------------------------------POST loclahost/prenotazioni (+request body)
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Prenotazione salvaPrenotazione(@RequestBody NewPostazioneBody newBody) throws Exception{			
		return ps.save(newBody);
	}
	
	// ---------------------------------------------------------GET loclahost/prenotazioni
	@GetMapping("")
	public List<Prenotazione> visualizzaPrenotazioni(){
		return ps.getPrenotazioni();
	}
	
	// ---------------------------------------------------------GET loclahost/prenotazioni/{id}
	@GetMapping("/{id_prenotazione}")
	public Prenotazione trovaId(@PathVariable int id_prenotazione) throws Exception {
		return ps.findById(id_prenotazione)
				.orElseThrow(() -> new Exception("ID Utente non trovato"));
	}
	
	// ---------------------------------------------------------GET loclahost/prenotazioni (+ request param)
	@GetMapping("/filtra")
	public List<Prenotazione> visualizzaByTipoAndCity(@RequestParam TipologiaPostazione tipo,	@RequestParam String city){
		return ps.findByTipoAndCity(tipo, city);
	}
	
	
	// ---------------------------------------------------------DELETE loclahost/prenotazioni/{id}
	@DeleteMapping("/{id_prenotazione}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void findAndDelete(@PathVariable int id_prenotazione) {
		ps.findByIdAndDelete(id_prenotazione);
	}
}
