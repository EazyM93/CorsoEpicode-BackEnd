package gestionePrenotazioni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionePrenotazioniApplication {

	public static void main(String[] args) {
		
		try {
			SpringApplication.run(GestionePrenotazioniApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
