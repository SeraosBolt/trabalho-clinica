package br.unipar.programacaoweb.clinica2.controller;

import br.unipar.programacaoweb.clinica2.model.*;
import br.unipar.programacaoweb.clinica2.service.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
@Tag(name = "Atendimento Web Controller", description = "Atendimentos")
public class AtendimentoWebController {

    private  AtendimentoService atendimentoService;
    private MedicoService medicoService;
    private PacienteService pacienteService;

    public AtendimentoWebController(AtendimentoService atendimentoService, MedicoService medicoService, PacienteService pacienteService) {
        this.atendimentoService = atendimentoService;
        this.medicoService =  medicoService;
        this.pacienteService = pacienteService;
    }

    @Operation(summary = "Obter todos os atendimentos", description = "Retorna uma lista com todos os atendimentos cadastrados.")
    @GetMapping(path = "/atendimento")
    public String getAllAtendimento(Model model) {
        List<Atendimento> atendimento = atendimentoService.getAll();
        List<Medico> medicos = medicoService.getAll();
        List<Paciente> pacientes = pacienteService.getAll();
        model.addAttribute("atendimento", atendimento);
        model.addAttribute("medicos", medicos);
        model.addAttribute("pacientes", pacientes);
        return "atendimento";
    }

    @Operation(summary = "Salvar um novo atendimento", description = "Salva um novo atendimento no sistema.")
    @PostMapping(path = "/atendimento/save")
    public String saveAtendimento(Atendimento atendimento) {
        System.out.println(atendimento);
        atendimentoService.save(atendimento);
        return "redirect:/atendimento";
    }
}
