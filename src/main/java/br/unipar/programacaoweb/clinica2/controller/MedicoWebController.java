package br.unipar.programacaoweb.clinica2.controller;

import br.unipar.programacaoweb.clinica2.model.Medico;
import br.unipar.programacaoweb.clinica2.service.MedicoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Tag(name = "Medico Web Controller", description = "Medico")
public class MedicoWebController {

    private final MedicoService medicoService;

    public MedicoWebController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @Operation(summary = "Obter todos os médicos", description = "Retorna uma lista de todos os médicos cadastrados.")
    @GetMapping(path = "/medico")
    public String getAllMedico(Model model) {
        List<Medico> medico = medicoService.getAll();
        model.addAttribute("medico", medico);
        return "medico";
    }

    @Operation(summary = "Salvar um médico", description = "Salva um novo médico no sistema.")
    @PostMapping(path = "/medico/save")
    public String saveUsuario(Medico medico) {
        medicoService.save(medico);
        return "redirect:/medico";
    }

}
