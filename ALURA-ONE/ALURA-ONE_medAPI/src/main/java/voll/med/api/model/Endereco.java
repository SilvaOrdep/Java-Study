package voll.med.api.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.dto.EnderecoDTO;
import voll.med.api.dto.EnderecoDadosUpdate;

@Embeddable
@Getter
@AllArgsConstructor
public class Endereco {
    private String logradouro, bairro, cep, cidade, uf, numero, complemento;

    public Endereco() {
    }

    public Endereco(EnderecoDTO enderecoDTO) {
        this.logradouro = enderecoDTO.logradouro();
        this.bairro = enderecoDTO.bairro();
        this.cep = enderecoDTO.cep();
        this.cidade = enderecoDTO.cidade();
        this.uf = enderecoDTO.uf();
        this.numero = enderecoDTO.numero();
        this.complemento = enderecoDTO.complemento();
    }

    public void atualizarDados(EnderecoDadosUpdate dados) {
        if (dados.logradouro() != null ) this.logradouro = dados.logradouro();
        if (dados.cep() != null ) this.cep = dados.cep();
        if (dados.bairro() != null ) this.bairro = dados.bairro();
        if (dados.cidade() != null ) this.cidade = dados.cidade();
        if (dados.uf() != null ) this.uf = dados.uf();
        if (dados.numero() != null ) this.numero = dados.numero();
        if (dados.complemento() != null ) this.complemento = dados.complemento();
    }
}
