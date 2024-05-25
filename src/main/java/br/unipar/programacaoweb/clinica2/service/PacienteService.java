package br.unipar.programacaoweb.clinica2.service;

import br.unipar.programacaoweb.clinica2.model.Paciente;
import br.unipar.programacaoweb.clinica2.repository.PacienteRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Tag(name = "Service do Paciente", description = "Paciente")
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    @Operation(summary = "Obter todos os pacientes", description = "Retorna uma lista de todos os pacientes cadastrados no sistema.")
    public List<Paciente> getAll(){
        return this.pacienteRepository.findAll();
    }

    @Operation(summary = "Salvar paciente", description = "Salva um novo paciente no sistema.")
    public Paciente save(Paciente paciente){
        return this.pacienteRepository.save(paciente);
    }
}
