package voll.med.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import voll.med.api.dto.MedicoDTO;
import voll.med.api.dto.MedicoDados;
import voll.med.api.dto.MedicoDadosUpdate;
import voll.med.api.model.Medico;
import voll.med.api.repository.MedicoRepository;

import java.util.Optional;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid MedicoDTO dados) {
        medicoRepository.save(new Medico(dados));
    }

    @GetMapping
    public Page<MedicoDados> listar(Pageable paginacao) {
        return medicoRepository.findMedicoByAtivoTrue(paginacao).map(MedicoDados::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid MedicoDadosUpdate dados) {
        buscarPorId(dados.id()).ifPresent(medico -> medico.atualizarDados(dados));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id) {
        buscarPorId(id).ifPresent(Medico::inativar);
    }

    private Optional<Medico> buscarPorId(Long id) {
        return medicoRepository.findById(id);
    }

}
