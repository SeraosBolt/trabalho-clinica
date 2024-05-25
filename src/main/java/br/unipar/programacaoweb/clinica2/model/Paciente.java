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
@Tag(name = "Model do paciente", description = "Paciente")
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID do paciente")
    private Integer id;

    @Schema(description = "Nome do paciente")
    private String nome;

    @Schema(description = "Telefone do paciente")
    private String telefone;

    @Schema(description = "Data de nascimento do paciente")
    private String dataNascimento;

    @Schema(description = "Plano de saúde do paciente")
    private String plano;
}
