package br.unipar.programacaoweb.clinica2.model;

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

    private Integer id;
    private String data_hora;
    private String anamnese ;

    @ManyToOne
    private Medico medico;



    @ManyToOne
    private Paciente paciente;

}
