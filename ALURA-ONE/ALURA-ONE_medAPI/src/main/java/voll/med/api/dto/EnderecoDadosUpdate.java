package voll.med.api.dto;

public record EnderecoDadosUpdate(String logradouro,
                                  String bairro,
                                  String cep,
                                  String cidade,
                                  String uf,
                                  String numero,
                                  String complemento) {

}
