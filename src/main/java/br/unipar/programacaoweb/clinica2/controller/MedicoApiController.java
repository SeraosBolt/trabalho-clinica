package br.unipar.programacaoweb.clinica2.controller;
import br.unipar.programacaoweb.clinica2.model.Medico;
import br.unipar.programacaoweb.clinica2.model.Paciente;
import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.service.MedicoService;
import br.unipar.programacaoweb.clinica2.service.PacienteService;
import br.unipar.programacaoweb.clinica2.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
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

    @GetMapping(path = "/api/medico")
    public ResponseEntity<List<Medico>> getAll() {
        return ResponseEntity.ok(medicoService.getAll());
    }

    @PostMapping(path = "/api/medico")
    public ResponseEntity<Medico> save(@RequestBody Medico medico){
        return ResponseEntity.ok(medicoService.save(medico));
    }

}
