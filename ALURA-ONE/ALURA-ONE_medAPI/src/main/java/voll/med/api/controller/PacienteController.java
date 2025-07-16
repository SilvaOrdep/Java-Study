package voll.med.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import voll.med.api.dto.PacienteDTO;
import voll.med.api.dto.PacienteDados;
import voll.med.api.dto.PacienteDadosUpdate;
import voll.med.api.model.Paciente;
import voll.med.api.repository.PacienteRepository;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid PacienteDTO dados, UriComponentsBuilder uriBuilder) {
        Paciente paciente = new Paciente(dados);
        pacienteRepository.save(paciente);

        URI uri = uriBuilder.path("/pacientes/{id}").buildAndExpand(paciente.getId()).toUri();

        return ResponseEntity.created(uri).body(new PacienteDados(paciente));
    }

    @GetMapping
    public ResponseEntity<Page<PacienteDados>> listar(Pageable pagincacao) {
        Page<PacienteDados> pagina = pacienteRepository.findAll(pagincacao).map(PacienteDados::new);

        return ResponseEntity.ok(pagina);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid PacienteDadosUpdate dados) {
        Optional<Paciente> paciente = buscarPorId(dados.id());
        PacienteDados pacienteResponse = null;

        if (paciente.isPresent()) {
            paciente.get().atualizarDados(dados);
            pacienteResponse = new PacienteDados(paciente.get());
        }

        return ResponseEntity.ok(pacienteResponse);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        buscarPorId(id).ifPresent(paciente -> pacienteRepository.delete(paciente));

        return ResponseEntity.noContent().build();
    }

    private Optional<Paciente> buscarPorId(Long id) {
        return pacienteRepository.findById(id);
    }

}
