package gestioneDispositiviAziendali.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioneDispositiviAziendali.entities.Dispositivo;
import gestioneDispositiviAziendali.payloads.ModificaStatoDispositivo;
import gestioneDispositiviAziendali.repository.DispositivoRepository;

@Service
public class DispositivoService {

	@Autowired
	DispositivoRepository dr;
	
	// ----------------------------------------------------salvataggio dispositivo
	public Dispositivo save(Dispositivo dispositivo) {
		dr.save(dispositivo);
		return dispositivo;
	}
		
	// ----------------------------------------------------fetch di tutti i dispositivi
	public List<Dispositivo> getDispositivi(){
		return dr.findAll();
	}
		
	// ----------------------------------------------------fetch dispositivo per id
	public Optional<Dispositivo> findById(UUID id) {
		
		Dispositivo dispositivoTrovato = null;
			
		for(Dispositivo d: getDispositivi())
			if(d.getId_dispositivo().equals(id))
				dispositivoTrovato = d;
			
		return Optional.ofNullable(dispositivoTrovato);
		
	 }
	
	// ----------------------------------------------------modifica stato dispositivo
	public Optional<Dispositivo> findByIdAndUpdate(UUID id, ModificaStatoDispositivo stato){
		
		Dispositivo dispositivoTrovato = null;
		
		for(Dispositivo d: getDispositivi())
			if(d.getId_dispositivo().equals(id))
				dispositivoTrovato = d;
		
		dispositivoTrovato.setStato(stato.getStato());
		
		dr.save(dispositivoTrovato);
		
		return Optional.ofNullable(dispositivoTrovato);
		
	}
	// ----------------------------------------------------cancellazione dispositivo
	public void findByIdAndDelete(UUID id) {
		dr.deleteById(id);
	}
	
	
}
