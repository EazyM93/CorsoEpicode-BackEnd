package gestioneDispositiviAziendali.payloads;

import java.util.UUID;

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
public class AssegnazionePayload {

	private UUID id_utente;
	private UUID id_dispositivo;
	
}
