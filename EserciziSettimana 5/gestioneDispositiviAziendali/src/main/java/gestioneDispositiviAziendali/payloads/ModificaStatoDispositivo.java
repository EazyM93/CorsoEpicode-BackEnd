package gestioneDispositiviAziendali.payloads;

import gestioneDispositiviAziendali.enums.StatoDispositivo;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModificaStatoDispositivo {

	@Enumerated(EnumType.STRING)
	private StatoDispositivo stato;
	
}
