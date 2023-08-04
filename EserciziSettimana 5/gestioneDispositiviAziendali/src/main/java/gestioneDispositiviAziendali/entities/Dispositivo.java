package gestioneDispositiviAziendali.entities;

import java.util.UUID;

import gestioneDispositiviAziendali.enums.StatoDIspositivo;
import gestioneDispositiviAziendali.enums.TipologiaDispositivo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id_dispositivo;
	
	@Column(nullable=false, name="tipo")
	@Enumerated(EnumType.STRING)
	private TipologiaDispositivo tipo;

	@Column(nullable = false, name = "stato")
	@Enumerated(EnumType.STRING)
	private StatoDIspositivo stato;
	
}
