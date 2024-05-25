package br.unipar.programacaoweb.clinica2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;

@Controller
@Tag(name = "Login Web Controller", description = "Login")
public class CadastroAdminWebController {

    @Operation(summary = "Exibe uma mensagem de hello world", description = "Retorna uma mensagem de saudação com o nome especificado.")
    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }

    @Operation(summary = "Página de cadastro de administrador", description = "Retorna a página de cadastro de administrador.")
    @GetMapping("/cadastroAdmin")
    public String loginAdmin() {
        return "cadastroAdmin";
    }

    public void loginHandle() {
    }
}
