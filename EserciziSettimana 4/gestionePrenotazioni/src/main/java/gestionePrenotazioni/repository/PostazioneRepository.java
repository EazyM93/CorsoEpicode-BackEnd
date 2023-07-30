package gestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gestionePrenotazioni.entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Integer>{

	
}