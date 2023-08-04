package gestioneDispositiviAziendali.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioneDispositiviAziendali.entities.Assegnazione;
import gestioneDispositiviAziendali.entities.Dispositivo;
import gestioneDispositiviAziendali.entities.Utente;
import gestioneDispositiviAziendali.payloads.AssegnazionePayload;
import gestioneDispositiviAziendali.repository.AssegnazioneRepository;
import gestioneDispositiviAziendali.repository.DispositivoRepository;
import gestioneDispositiviAziendali.repository.UtenteRepository;

@Service
public class AssegnazioneService {

	@Autowired
	AssegnazioneRepository ar;
	
	@Autowired
	UtenteRepository ur;
	
	@Autowired
	DispositivoRepository dr;
	
	// ----------------------------------------------------salvataggio assegnazione
		public Assegnazione save(AssegnazionePayload assegnazioneBody) {
			
			Utente u = ur.findById(assegnazioneBody.getId_utente()).get();
			Dispositivo d = dr.findById(assegnazioneBody.getId_dispositivo()).get();
			
			Assegnazione assCorrente = Assegnazione.builder()
					.utente(u)
					.dispositivo(d)
					.build();
			
			ar.save(assCorrente);
			return assCorrente;
		}
		
		// ----------------------------------------------------fetch di tutti gli assegnazioni
		public List<Assegnazione> getAssegnazioni(){
			return ar.findAll();
		}
		
		// ----------------------------------------------------fetch assegnazione per id
		public Optional<Assegnazione> findById(UUID id) {
			Assegnazione assegnazioneTrovato = null;
			
			for(Assegnazione u: getAssegnazioni())
				if(u.getId_assegnazione().equals(id))
					assegnazioneTrovato = u;
			
			return Optional.ofNullable(assegnazioneTrovato);
	 	}
		
		// ----------------------------------------------------cancellazione assegnazione
		public void findByIdAndDelete(UUID id) {
			ar.deleteById(id);
		}
	
}
