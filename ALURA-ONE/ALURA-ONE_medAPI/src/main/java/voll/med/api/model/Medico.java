package voll.med.api.model;

import jakarta.persistence.*;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.dto.MedicoDTO;
import voll.med.api.dto.MedicoDadosUpdate;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private String telefone;
    @Enumerated
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;
    private boolean ativo;

    public Medico(MedicoDTO medicoDTO) {
        this.nome = medicoDTO.nome();
        this.email = medicoDTO.email();
        this.crm = medicoDTO.crm();
        this.telefone = medicoDTO.telefone();
        this.especialidade = medicoDTO.especialidade();
        this.endereco = new Endereco(medicoDTO.endereco());
        this.ativo = true;
    }

    public void atualizarDados(@Valid MedicoDadosUpdate dados) {
        if (dados.nome() != null )  this.nome = dados.nome();
        if (dados.telefone() != null )  this.telefone = dados.telefone();
        if (dados.endereco() != null )  this.endereco.atualizarDados(dados.endereco());
    }

    public void inativar() {
        this.ativo = false;
    }
}
