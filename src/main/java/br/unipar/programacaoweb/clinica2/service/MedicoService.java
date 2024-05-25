package br.unipar.programacaoweb.clinica2.service;

import br.unipar.programacaoweb.clinica2.model.Medico;
import br.unipar.programacaoweb.clinica2.repository.MedicoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Tag(name = "Service do Medico", description = "Medico")
public class MedicoService {
    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository){
        this.medicoRepository = medicoRepository;
    }

    @Operation(summary = "Obter todos os médicos", description = "Retorna uma lista de todos os médicos cadastrados no sistema.")
    public List<Medico> getAll(){
        return this.medicoRepository.findAll();
    }

    @Operation(summary = "Salvar médico", description = "Salva um novo médico no sistema.")
    public Medico save(Medico medico){
        return this.medicoRepository.save(medico);
    }

}
