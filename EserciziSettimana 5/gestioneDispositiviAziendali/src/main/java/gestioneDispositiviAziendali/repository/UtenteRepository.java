package gestioneDispositiviAziendali.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import gestioneDispositiviAziendali.entities.Utente;

public interface UtenteRepository extends JpaRepository<Utente, UUID>{
	
}
