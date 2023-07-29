package gestionePrenotazioni.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestionePrenotazioni.entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Integer>{

}
