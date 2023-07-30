package gestionePrenotazioni.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestionePrenotazioni.entities.Prenotazione;
import gestionePrenotazioni.entities.Utente;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazione, Integer>{

	Optional<Prenotazione> findFirstByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
	
}
