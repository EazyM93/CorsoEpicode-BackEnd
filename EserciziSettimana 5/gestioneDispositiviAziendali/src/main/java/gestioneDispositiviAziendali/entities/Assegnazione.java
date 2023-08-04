package gestioneDispositiviAziendali.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="assegnazioni")

public class Assegnazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id_utente;
	
	@JoinColumn(name="id_dispositivo")
	private Dispositivo dispositivo;
	
	@JoinColumn(name="id_utente")
	private Utente utente;
	
}
