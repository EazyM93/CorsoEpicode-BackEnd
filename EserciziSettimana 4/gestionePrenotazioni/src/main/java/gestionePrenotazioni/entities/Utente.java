package gestionePrenotazioni.entities;

import java.util.Set;

import org.springframework.context.annotation.Scope;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="utenti")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Utente {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id_utente;
	
	private String username;
	private String nomeCompleto;
	private String email;
	
	//@OneToMany(mappedBy="utente")
	//Set<Prenotazione> prenotazioni;
	
}
