package gestionePrenotazioni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import gestionePrenotazioni.entities.Edificio;
import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.entities.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class GestionaleConfiguration {

	@Bean
	public Edificio newEdificio(String nomeEdificio, String indirizzo, String city) {
		Edificio.builder()
			.nomeEdificio(nomeEdificio)
			.indirizzo(indirizzo)
			.city(city)
			.build();
		return new Edificio();}
	
	@Bean
	public Utente newUtente(String username, String nome, String email) {
		Utente.builder()
			.username(username)
			.nomeCompleto(nome)
			.email(email)
			.build();
		return new Utente();
	}
	
	@Bean
	public Postazione p( ) {return new Postazione();}
}
