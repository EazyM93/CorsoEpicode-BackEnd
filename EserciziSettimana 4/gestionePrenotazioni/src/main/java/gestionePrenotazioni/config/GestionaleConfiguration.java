package gestionePrenotazioni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class GestionaleConfiguration {

	@Bean
	public Edificio e() {return new Edificio();}
	
	@Bean
	public Utente u() {return new Utente();}
}
