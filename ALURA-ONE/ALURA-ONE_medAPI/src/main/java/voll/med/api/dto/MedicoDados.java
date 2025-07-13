package voll.med.api.dto;

import voll.med.api.model.Especialidade;
import voll.med.api.model.Medico;

public record MedicoDados(Long id,
                          String nome,
                          String email,
                          String crm,
                          Especialidade especialidade) {

    public MedicoDados(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
