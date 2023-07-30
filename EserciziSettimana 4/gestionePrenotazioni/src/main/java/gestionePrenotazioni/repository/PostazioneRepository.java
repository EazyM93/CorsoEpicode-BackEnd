package gestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestionePrenotazioni.entities.Postazione;
import gestionePrenotazioni.enums.TipologiaPostazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Integer>{

	List<Postazione> findByTipoAndCittà(TipologiaPostazione tipo, String city);
	
}
