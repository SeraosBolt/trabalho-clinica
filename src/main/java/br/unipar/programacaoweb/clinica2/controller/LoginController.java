package br.unipar.programacaoweb.clinica2.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller

@Tag(name = "Login Controller", description = "Login")
public class LoginController {

    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World")
            String name ){
        return "Hello " + name + "!";
    }

    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }

    public void loginHandle(){

    }

}
