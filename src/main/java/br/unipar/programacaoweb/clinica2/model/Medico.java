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
@Tag(name = "Model do médico", description = "Médico")
public class Medico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID do médico")
    private Integer id;

    @Schema(description = "Nome do médico")
    private String nome;

    @Schema(description = "Especialidade do médico")
    private String especialidade;
}