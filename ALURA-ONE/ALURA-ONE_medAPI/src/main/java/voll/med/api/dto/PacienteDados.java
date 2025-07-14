package voll.med.api.dto;

import voll.med.api.model.Paciente;

public record PacienteDados(Long id,
                          String nome,
                          String email,
                          String cpf) {

    public PacienteDados(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }

}
