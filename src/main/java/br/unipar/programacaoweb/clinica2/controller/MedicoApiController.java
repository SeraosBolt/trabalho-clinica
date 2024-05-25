package br.unipar.programacaoweb.clinica2.controller;

import br.unipar.programacaoweb.clinica2.model.Medico;
import br.unipar.programacaoweb.clinica2.service.MedicoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Medico API Controller", description = "Medico")
public class MedicoApiController {

    private final MedicoService medicoService;

    public MedicoApiController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @Operation(summary = "Obter todos os médicos", description = "Retorna uma lista de todos os médicos cadastrados.")
    @GetMapping(path = "/api/medico")
    public ResponseEntity<List<Medico>> getAll() {
        return ResponseEntity.ok(medicoService.getAll());
    }

    @Operation(summary = "Salvar um médico", description = "Salva um novo médico no sistema.")
    @PostMapping(path = "/api/medico")
    public ResponseEntity<Medico> save(@RequestBody Medico medico){
        return ResponseEntity.ok(medicoService.save(medico));
    }

}
