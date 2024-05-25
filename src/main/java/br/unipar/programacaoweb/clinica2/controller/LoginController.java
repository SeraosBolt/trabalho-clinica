package br.unipar.programacaoweb.clinica2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@Tag(name = "Login Controller", description = "Login")
public class LoginController {

    @Operation(summary = "Página de login", description = "Retorna a página de login.")
    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }

    public void loginHandle(){

    }
}
