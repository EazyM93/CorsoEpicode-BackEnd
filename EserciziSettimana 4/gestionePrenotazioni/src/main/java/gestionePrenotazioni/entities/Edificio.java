package gestionePrenotazioni.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="edifici")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Edificio {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id_edificio;
	
	@Column(name="nome")
	private String nomeEdificio;
	
	@Column(name="indirizzo")
	private String indirizzo;
	
	@Column(name="città")
	private String city;
	
}
