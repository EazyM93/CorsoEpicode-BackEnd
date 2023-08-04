package gestioneDispositiviAziendali.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioneDispositiviAziendali.entities.Dispositivo;
import gestioneDispositiviAziendali.repository.DispositivoRepository;

@Service
public class DispositivoService {

	@Autowired
	DispositivoRepository dr;
	
	// ----------------------------------------------------salvataggio utente
	public Dispositivo save(Dispositivo dispositivo) {
		dr.save(dispositivo);
		return dispositivo;
	}
		
	// ----------------------------------------------------fetch di tutti gli utenti
	public List<Dispositivo> getDispositivi(){
		return dr.findAll();
	}
		
	// ----------------------------------------------------fetch utente per id
	public Optional<Dispositivo> findById(UUID id) {
		Dispositivo dispositivoTrovato = null;
			
		for(Dispositivo d: getDispositivi())
			if(d.getId_dispositivo().equals(id))
				dispositivoTrovato = d;
			
		return Optional.ofNullable(dispositivoTrovato);
	 }
		
	// ----------------------------------------------------cancellazione utente
	public void findByIdAndDelete(UUID id) {
		dr.deleteById(id);
	}
	
	
}
