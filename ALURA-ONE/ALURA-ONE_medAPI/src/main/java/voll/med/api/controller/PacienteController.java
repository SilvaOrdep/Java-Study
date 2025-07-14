package voll.med.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import voll.med.api.dto.PacienteDTO;
import voll.med.api.dto.PacienteDados;
import voll.med.api.dto.PacienteDadosUpdate;
import voll.med.api.model.Paciente;
import voll.med.api.repository.PacienteRepository;

import java.util.Optional;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid PacienteDTO paciente) {
        pacienteRepository.save(new Paciente(paciente));
    }

    @GetMapping
    public Page<PacienteDados> listar(Pageable pagincacao) {
        return pacienteRepository.findAll(pagincacao).map(PacienteDados::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid PacienteDadosUpdate dados) {
        buscarPorId(dados.id()).ifPresent(paciente -> paciente.atualizarDados(dados));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        buscarPorId(id).ifPresent(paciente -> pacienteRepository.delete(paciente));
    }

    private Optional<Paciente> buscarPorId(Long id) {
        return pacienteRepository.findById(id);
    }

}
