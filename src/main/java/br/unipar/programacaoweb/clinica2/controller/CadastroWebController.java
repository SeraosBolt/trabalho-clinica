package br.unipar.programacaoweb.clinica2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@Controller

@Tag(name = "Cadastro Web Controller", description = "Login")
public class CadastroWebController {

    @GetMapping("/cadastro")
    public String LoginAdmin(){
        return "cadastro";
    }

    public void loginHandle(){

    }


}
