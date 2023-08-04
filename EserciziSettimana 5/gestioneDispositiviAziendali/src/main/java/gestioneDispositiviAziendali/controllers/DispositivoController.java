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

import gestioneDispositiviAziendali.entities.Dispositivo;
import gestioneDispositiviAziendali.services.DispositivoService;

@RestController
@RequestMapping("/dispositivi")
public class DispositivoController {

	@Autowired
	DispositivoService ds;
	
	// ---------------------------------------------------------POST dispositivo
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Dispositivo salvaUtente(@RequestBody Dispositivo bodyDispositivo) {
		return ds.save(bodyDispositivo);
	}
	
	// ---------------------------------------------------------GET dispositivi
	@GetMapping("")
	public List<Dispositivo> visualizzaUtenti(){
		return ds.getDispositivi();
	}
	
	// ---------------------------------------------------------GET dispositivo (id)
	@GetMapping("/{id_dispositivo}")
	public Dispositivo trovaId(@PathVariable UUID id_dispositivo) throws Exception {
		return ds.findById(id_dispositivo)
				.orElseThrow(() -> new Exception("ID Dispositivo non trovato"));
	}
	
	// ---------------------------------------------------------DELETE dispositivo/{id}
	@DeleteMapping("/{id_dispositivo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void findAndDelete(@PathVariable UUID id_dispositivo) {
		ds.findByIdAndDelete(id_dispositivo);
	}
	
}
