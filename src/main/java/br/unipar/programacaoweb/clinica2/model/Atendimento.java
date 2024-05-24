package br.unipar.programacaoweb.clinica2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter

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
