package br.unipar.programacaoweb.clinica2.service;

import br.unipar.programacaoweb.clinica2.model.Atendimento;
import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.repository.AtendimentoRepository;
import br.unipar.programacaoweb.clinica2.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService {

    private final AtendimentoRepository atendimentoRepository;

    public AtendimentoService(AtendimentoRepository atendimentoRepository){
        this.atendimentoRepository = atendimentoRepository;
    }

    public List<Atendimento> getAll(){
        return this.atendimentoRepository.findAll();
    }

    public Atendimento save(Atendimento atendimento){
        return this.atendimentoRepository.save(atendimento);
    }


}
