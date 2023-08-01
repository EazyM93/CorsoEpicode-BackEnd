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

import day1_01_08_23.entities.Postazione;
import day1_01_08_23.services.PostazioneService;

@RestController
@RequestMapping("/postazioni")
public class PostazioneController {

	@Autowired
	PostazioneService ps;
	
	// ---------------------------------------------------------POST loclahost/postazioni (+request body)
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Postazione salvaPostazione(@RequestBody Postazione bodyPostazione) {
		return ps.save(bodyPostazione);
	}
		
	// ---------------------------------------------------------GET loclahost/postazioni
	@GetMapping("")
	public List<Postazione> visualizzaPostazioni(){
		return ps.getPostazioni();
	}
		
	// ---------------------------------------------------------GET loclahost/postazioni/{id}
	@GetMapping("/{id_postazione}")
	public Postazione trovaId(@PathVariable int id_postazione) throws Exception {
		return ps.findById(id_postazione)
				.orElseThrow(() -> new Exception("ID Postazione non trovato"));
	}
		
	// ---------------------------------------------------------PUT loclahost/postazioni/{id} (+request body)
	@PutMapping("/{id_postazione}")
	public Postazione findAndUpdate(@PathVariable int id_postazione, @RequestBody Postazione body) throws Exception {
		return ps.findByIdAndUpdate(id_postazione, body)
				.orElseThrow(() -> new Exception("ID Postazione non trovato"));
	}
		
	// ---------------------------------------------------------DELETE loclahost/postazioni/{id}
	@DeleteMapping("/{id_postazione}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void findAndDelete(@PathVariable int id_postazione) {
		ps.findByIdAndDelete(id_postazione);
	}	
	
}
