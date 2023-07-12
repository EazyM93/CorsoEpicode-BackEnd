package entities;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
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
	
	@Enumerated(EnumType.STRING)
	private Sesso sesso;
	
	@OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
	@OrderBy("dataEvento ASC")
	private List<Partecipazione> listaPartecipazioni;
	
	public Persona(String nome, String cognome, String email, String dataNascita, Sesso sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = LocalDate.parse(dataNascita);
		this.sesso = sesso;
	}
	
	public void setDataNascita(String dataNascita) {
		this.dataNascita = LocalDate.parse(dataNascita);
	}
}
