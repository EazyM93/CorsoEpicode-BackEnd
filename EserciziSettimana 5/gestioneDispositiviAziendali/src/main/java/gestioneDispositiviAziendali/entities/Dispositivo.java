package gestioneDispositiviAziendali.entities;

import java.util.UUID;

import gestioneDispositiviAziendali.enums.StatoDispositivo;
import gestioneDispositiviAziendali.enums.TipologiaDispositivo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Table(name="dispositivi")

public class Dispositivo {

	@Id
	@GeneratedValue
	private UUID id_dispositivo;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private TipologiaDispositivo tipo;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private StatoDispositivo stato;
	
}
