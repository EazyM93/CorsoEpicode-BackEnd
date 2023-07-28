package gestionePrenotazioni.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestionePrenotazioni.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{
		
}
