package br.unipar.programacaoweb.clinica2.controller;
import br.unipar.programacaoweb.clinica2.model.Medico;
import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.service.MedicoService;
import br.unipar.programacaoweb.clinica2.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

@Tag(name = "Atendimento Web Controller", description = "Medico")
public class MedicoWebController {

    private final MedicoService medicoService;

    public MedicoWebController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping(path = "/medico")
    public String getAllMedico(Model model) {
        List<Medico> medico = medicoService.getAll();
        model.addAttribute("medico", medico);
        return "medico";
    }

    @PostMapping(path = "/medico/save")
    public String saveUsuario(Medico medico) {
        medicoService.save(medico);
        return "redirect:/medico";
    }

}
