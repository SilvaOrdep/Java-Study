package voll.med.api.dto;

import voll.med.api.model.Especialidade;

public record MedicoDTO(String nome, String email, String crm, Especialidade especialidade, EnderecoDTO endereco) {
}
