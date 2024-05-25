package br.unipar.programacaoweb.clinica2.controller;

import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Tag(name = "Usuario Web Controller", description = "Usuario")
public class UsuarioWebController {

    private final UsuarioService usuarioService;

    public UsuarioWebController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Operation(summary = "Obter todos os usuários", description = "Retorna uma lista de todos os usuários cadastrados.")
    @GetMapping(path = "/usuarios")
    public String getAllUsuario(Model model) {
        List<Usuario> usuarios = usuarioService.getAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

    @Operation(summary = "Salvar um usuário", description = "Salva um novo usuário no sistema.")
    @PostMapping(path = "/usuarios/save")
    public String saveUsuario(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuarios";
    }

    @Operation(summary = "Realizar login", description = "Efetua login de um usuário no sistema.")
    @PostMapping(path = "/usuarios/login")
    public String login(Usuario usuario) {
        Usuario user = usuarioService.login(usuario);
        System.out.println(user);
        if (user != null) {
            if(user.getAdmin() != null){
                return "redirect:/cadastroAdmin";
            }else{
                return "redirect:/cadastro";
            }

        } else {
            return "redirect:/login";
        }
    }

}
