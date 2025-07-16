package voll.med.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import voll.med.api.dto.MedicoDTO;
import voll.med.api.dto.MedicoDados;
import voll.med.api.dto.MedicoDadosUpdate;
import voll.med.api.model.Medico;
import voll.med.api.repository.MedicoRepository;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid MedicoDTO dados, UriComponentsBuilder uriBuilder) {
        Medico medico = new Medico(dados);
        medicoRepository.save(medico);
        URI uri = uriBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();
        return ResponseEntity.created(uri).body(new MedicoDados(medico));
    }

    @GetMapping
    public ResponseEntity<Page<MedicoDados>> listar(Pageable paginacao) {
        Page<MedicoDados> medico = medicoRepository.findMedicoByAtivoTrue(paginacao).map(MedicoDados::new);

        return ResponseEntity.ok(medico);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid MedicoDadosUpdate dados) {
        Optional<Medico> medico = buscarPorId(dados.id());
        MedicoDados medicoResponse = null;

        if (medico.isPresent()) {
            medico.get().atualizarDados(dados);
            medicoResponse = new MedicoDados(medico.get());
        }

        return ResponseEntity.ok(medicoResponse);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletar(@PathVariable Long id) {
        buscarPorId(id).ifPresent(Medico::inativar);

        return ResponseEntity.noContent().build();
    }

    private Optional<Medico> buscarPorId(Long id) {
        return medicoRepository.findById(id);
    }

}
