package gestionePrenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestionePrenotazioni.entities.Prenotazione;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazione, Integer>{

}
