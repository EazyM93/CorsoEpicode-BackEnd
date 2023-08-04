package gestioneDispositiviAziendali.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import gestioneDispositiviAziendali.entities.Assegnazione;

public interface AssegnazioneRepository extends JpaRepository<Assegnazione, UUID>{

}
