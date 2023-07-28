package gestionePrenotazioni.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import gestionePrenotazioni.entities.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer>{

}
