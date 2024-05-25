package br.unipar.programacaoweb.clinica2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@Controller

@Tag(name = "Login Web Controller", description = "Login")
public class CadastroAdminWebController {

    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World")
                             String name ){
        return "Hello " + name + "!";
    }

    @GetMapping("/cadastroAdmin")
    public String LoginAdmin(){
        return "cadastroAdmin";
    }

    public void loginHandle(){

    }

}

