package voll.med.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voll.med.api.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findMedicoByAtivoTrue(Pageable paginacao);

}
