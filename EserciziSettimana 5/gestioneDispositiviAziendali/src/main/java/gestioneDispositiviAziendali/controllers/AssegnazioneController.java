package gestioneDispositiviAziendali.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import gestioneDispositiviAziendali.entities.Assegnazione;
import gestioneDispositiviAziendali.payloads.AssegnazionePayload;
import gestioneDispositiviAziendali.services.AssegnazioneService;

@RestController
@RequestMapping("/assegnazioni")
public class AssegnazioneController {

	@Autowired
	AssegnazioneService as;
	
	// ---------------------------------------------------------POST assegnazione
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Assegnazione salvaAssegnazione(@RequestBody AssegnazionePayload bodyAssegnazione) {
		return as.save(bodyAssegnazione);
	}
		
	// ---------------------------------------------------------GET assegnazioni
	@GetMapping("")
	public List<Assegnazione> visualizzaAssegnazioni(){
		return as.getAssegnazioni();
	}
		
	// ---------------------------------------------------------GET assegnazione (id)
	@GetMapping("/{id_assegnazione}")
	public Assegnazione trovaId(@PathVariable UUID id_assegnazione) throws Exception {
		return as.findById(id_assegnazione)
				.orElseThrow(() -> new Exception("ID Assegnazione non trovato"));
	}
	
	// ---------------------------------------------------------DELETE dispositivo/{id}
	@DeleteMapping("/{id_assegnazione}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void findAndDelete(@PathVariable UUID id_assegnazione) {
		as.findByIdAndDelete(id_assegnazione);
	}
}
