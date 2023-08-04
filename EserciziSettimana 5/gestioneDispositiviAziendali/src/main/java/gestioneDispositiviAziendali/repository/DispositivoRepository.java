package gestioneDispositiviAziendali.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import gestioneDispositiviAziendali.entities.Dispositivo;

public interface DispositivoRepository extends JpaRepository<Dispositivo, UUID>{

}
