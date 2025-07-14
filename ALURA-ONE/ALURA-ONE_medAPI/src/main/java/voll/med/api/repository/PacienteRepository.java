package voll.med.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voll.med.api.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
