package day1_01_08_23.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

	@GetMapping("")
	public ResponseEntity<String> getInfo(@RequestParam String lingua) {
		
		ResponseEntity<String> response = null;
		
		boolean ita = "italiano".equalsIgnoreCase(lingua);
		boolean eng = "inglese".equalsIgnoreCase(lingua);
		
		//info in italiano
		if(ita) {
			response = ResponseEntity.ok("Benvenuto nel sistema di prenotazione, prenota la tua postazione inserendo Nome, Cognome e mail. Verifica se la data è disponibile.");
		}
		
		//info in inglese
		if(eng) {
			response = ResponseEntity.ok("Welcome into the reservetion system, reserve a place submitting Name, Surname and mail. Check date availability.");
		}
		
		//lingua non supportata
		if(response == null) {
			return ResponseEntity.badRequest().body("Lingua non supportata");
		}else return response;
		
	}
	
}
