package br.unipar.programacaoweb.clinica2.model;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Tag(name = "Model do atendimento", description = "Atendimento")
public class Atendimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID do atendimento")
    private Integer id;

    @Schema(description = "Data e hora do atendimento")
    private String data_hora;

    @Schema(description = "Anamnese do atendimento")
    private String anamnese ;

    @ManyToOne
    @Schema(description = "Médico responsável pelo atendimento")
    private Medico medico;

    @ManyToOne
    @Schema(description = "Paciente atendido")
    private Paciente paciente;
}