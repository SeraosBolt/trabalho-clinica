package br.unipar.programacaoweb.clinica2;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@Tag(name = "Classe Main do projeto", description = "Main")
public class Clinica2Application {

    public static void main(String[] args) {
        SpringApplication.run(Clinica2Application.class, args);
    }

}
