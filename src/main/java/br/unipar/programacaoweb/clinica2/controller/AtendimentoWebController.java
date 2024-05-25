package br.unipar.programacaoweb.clinica2.controller;

import br.unipar.programacaoweb.clinica2.model.Atendimento;
import br.unipar.programacaoweb.clinica2.model.Medico;
import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.service.AtendimentoService;
import br.unipar.programacaoweb.clinica2.service.MedicoService;
import br.unipar.programacaoweb.clinica2.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

@Tag(name = "Atendimento Web Controller", description = "Atendimentos")
public class AtendimentoWebController {

    private  AtendimentoService atendimentoService;
    private MedicoService medicoService;

    public AtendimentoWebController(AtendimentoService atendimentoService, MedicoService medicoService) {
        this.atendimentoService = atendimentoService;
        this.medicoService =  medicoService;
    }

    @GetMapping(path = "/atendimento")
    public String getAllAtendimento(Model model) {
        List<Atendimento> atendimento = atendimentoService.getAll();
        List<Medico> medicos = medicoService.getAll();
        model.addAttribute("atendimento", atendimento);
        model.addAttribute("medicos", medicos);
        return "atendimento";
    }

    @PostMapping(path = "/atendimento/save")
    public String saveAtendimento(Atendimento atendimento) {
        atendimentoService.save(atendimento);
        return "redirect:/atendimento";
    }

}
