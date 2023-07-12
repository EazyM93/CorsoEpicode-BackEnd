package entities;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "persone")
@Getter
@Setter
@NoArgsConstructor
public class Persona {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataNascita;
	private Sesso sesso;
	private List<Partecipazione> listaPartecipazioni;
	public Persona(String nome, String cognome, String email, LocalDate dataNascita, Sesso sesso, List<Partecipazione> listaPartecipazioni) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
		this.listaPartecipazioni = listaPartecipazioni;
	}
	
	
}
