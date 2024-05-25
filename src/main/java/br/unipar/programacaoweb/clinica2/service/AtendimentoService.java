package br.unipar.programacaoweb.clinica2.service;

import br.unipar.programacaoweb.clinica2.model.Atendimento;
import br.unipar.programacaoweb.clinica2.repository.AtendimentoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Tag(name = "Service do atendimento", description = "Atendimento")
public class AtendimentoService {

    private final AtendimentoRepository atendimentoRepository;

    public AtendimentoService(AtendimentoRepository atendimentoRepository){
        this.atendimentoRepository = atendimentoRepository;
    }

    @Operation(summary = "Obter todos os atendimentos", description = "Retorna uma lista de todos os atendimentos disponíveis.")
    public List<Atendimento> getAll(){
        return this.atendimentoRepository.findAll();
    }

    @Operation(summary = "Salvar atendimento", description = "Salva um novo atendimento no sistema.")
    public Atendimento save(Atendimento atendimento){
        return this.atendimentoRepository.save(atendimento);
    }
}
