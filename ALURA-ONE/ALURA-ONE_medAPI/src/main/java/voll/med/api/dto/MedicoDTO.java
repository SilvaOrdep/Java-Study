package voll.med.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import voll.med.api.model.Especialidade;

public record MedicoDTO(@NotBlank String nome,
                        @NotBlank @Email String email,
                        @NotBlank String crm,
                        @NotBlank String telefone,
                        @NotNull Especialidade especialidade,
                        @NotNull @Valid EnderecoDTO endereco) {

}
