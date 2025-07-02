package study.gof.service;

import org.springframework.stereotype.Service;
import study.gof.model.Cliente;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void alterar(Long id, Cliente cliente);
    void excluir(Long id);
}
