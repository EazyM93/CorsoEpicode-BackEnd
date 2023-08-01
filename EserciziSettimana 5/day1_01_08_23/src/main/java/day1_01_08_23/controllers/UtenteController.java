package day1_01_08_23.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import day1_01_08_23.entities.Utente;
import day1_01_08_23.services.UtenteService;

@RestController
@RequestMapping("/utenti")
public class UtenteController {

	@Autowired
	UtenteService us;
	
	// ---------------------------------------------------------POST loclahost/utenti (+request body)
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Utente salvaUtente(@RequestBody Utente bodyUtente) {
		return us.save(bodyUtente);
	}
	
	// ---------------------------------------------------------GET loclahost/utenti
	@GetMapping("")
	public List<Utente> visualizzaUtenti(){
		return us.getUtenti();
	}
	
	// ---------------------------------------------------------GET loclahost/utenti/{id}
	@GetMapping("/{id_utente}")
	public Utente trovaId(@PathVariable int id_utente) throws Exception {
		return us.findById(id_utente)
				.orElseThrow(() -> new Exception("ID Utente non trovato"));
	}
	
	// ---------------------------------------------------------PUT loclahost/utenti/{id} (+request body)
	@PutMapping("/{id_utente}")
	public Utente findAndUpdate(@PathVariable int id_utente, @RequestBody Utente body) throws Exception {
		return us.findByIdAndUpdate(id_utente, body)
				.orElseThrow(() -> new Exception("ID Utente non trovato"));
	}
	
	// ---------------------------------------------------------DELETE loclahost/utenti/{id}
	@DeleteMapping("/{id_utente}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void findAndDelete(@PathVariable int id_utente) {
		us.findByIdAndDelete(id_utente);
	}

}
