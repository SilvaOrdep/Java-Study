package voll.med.api.model;

import jakarta.persistence.*;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.dto.PacienteDTO;
import voll.med.api.dto.PacienteDadosUpdate;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    @Embedded
    private Endereco endereco;

    public Paciente(PacienteDTO pacienteDTO) {
        this.nome = pacienteDTO.nome();
        this.email = pacienteDTO.email();
        this.cpf = pacienteDTO.cpf();
        this.telefone = pacienteDTO.telefone();
        this.endereco = new Endereco(pacienteDTO.endereco());
    }

    public void atualizarDados(@Valid PacienteDadosUpdate dados) {
        if (dados.nome() != null )  this.nome = dados.nome();
        if (dados.telefone() != null )  this.telefone = dados.telefone();
        if (dados.endereco() != null )  this.endereco.atualizarDados(dados.endereco());
    }

}
