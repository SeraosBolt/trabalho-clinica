package br.unipar.programacaoweb.clinica2.controller;

import br.unipar.programacaoweb.clinica2.model.Atendimento;
import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.service.AtendimentoService;
import br.unipar.programacaoweb.clinica2.service.UsuarioService;
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
public class AtendimentoWebController {

    private final AtendimentoService atendimentoService;

    public AtendimentoWebController(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    @GetMapping(path = "/atendimento")
    public String getAllAtendimento(Model model) {
        List<Atendimento> atendimento = atendimentoService.getAll();
        model.addAttribute("atendimento", atendimento);
        return "atendimento";
    }

    @PostMapping(path = "/atendimento/save")
    public String saveAtendimento(Atendimento atendimento) {
        atendimentoService.save(atendimento);
        return "redirect:/atendimento";
    }

}
