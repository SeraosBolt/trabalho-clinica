package br.unipar.programacaoweb.clinica2.model;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Tag(name = "Model do usuário", description = "Usuário")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID do usuário")
    private Integer id;

    @Schema(description = "Nome do usuário")
    private String nome;

    @Schema(description = "Login do usuário")
    private String login;

    @Schema(description = "Senha do usuário")
    private String senha;

    @Schema(description = "Indica se o usuário é um administrador")
    private Boolean admin;
}
