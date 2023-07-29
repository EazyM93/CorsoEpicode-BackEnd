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
	public Edificio newEdificio() {return new Edificio();}
	
	@Bean
	public Utente newUtente() {return new Utente();}
	
	@Bean
	public Postazione newPostazione() {return new Postazione();}
	
	@Bean
	public Prenotazione newPrenotazione() {return new Prenotazione();}
}
