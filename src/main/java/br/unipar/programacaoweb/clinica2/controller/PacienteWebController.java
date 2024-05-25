package br.unipar.programacaoweb.clinica2.controller;
import br.unipar.programacaoweb.clinica2.model.Paciente;
import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.service.PacienteService;
import br.unipar.programacaoweb.clinica2.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller

@Tag(name = "Paciente Web Controller", description = "Paciente")
public class PacienteWebController {

    private final PacienteService pacienteService;

    public PacienteWebController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping(path = "/paciente")
    public String getAllPaciente(Model model) {
        List<Paciente> paciente = pacienteService.getAll();
        model.addAttribute("paciente", paciente);
        return "paciente";
    }

    @PostMapping(path = "/paciente/save")
    public String savePaciente(Paciente paciente) {
        pacienteService.save(paciente);
        return "redirect:/paciente";
    }
}
