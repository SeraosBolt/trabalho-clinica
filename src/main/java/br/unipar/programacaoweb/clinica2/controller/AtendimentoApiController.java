package br.unipar.programacaoweb.clinica2.controller;
import br.unipar.programacaoweb.clinica2.model.Atendimento;
import br.unipar.programacaoweb.clinica2.service.AtendimentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

@Tag(name = "Atendimento API controller", description = "Atendimentos")
public class AtendimentoApiController {

    private final AtendimentoService atendimentoService;

    public AtendimentoApiController(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    @GetMapping(path = "/api/atendimento")
    public ResponseEntity<List<Atendimento>> getAll() {
        return ResponseEntity.ok(atendimentoService.getAll());
    }

    @PostMapping(path = "/api/atendimento")
    public ResponseEntity<Atendimento> save(@RequestBody Atendimento atendimento){
        return ResponseEntity.ok(atendimentoService.save(atendimento));
    }
}
