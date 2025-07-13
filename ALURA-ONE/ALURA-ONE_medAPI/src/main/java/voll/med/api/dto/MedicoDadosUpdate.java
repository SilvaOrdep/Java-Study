package voll.med.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record MedicoDadosUpdate(@NotNull Long id, String nome, String telefone, @Valid EnderecoDadosUpdate endereco) {
}
