package gestionePrenotazioni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.entities.Prenotazione;
import gestionePrenotazioni.entities.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class GestionaleConfiguration {
	
	@Bean
	public Edificio nuovoEdificio() {
		return new Edificio();
	}
	
	@Bean
	public Utente nuovoUtente() {
		return new Utente();
	}
	
	@Bean
	public Postazione nuovaPostazione() {
		return new Postazione();
	}
	
	@Bean
	public Prenotazione newPrenotazione() {
		return new Prenotazione();
	}
}
