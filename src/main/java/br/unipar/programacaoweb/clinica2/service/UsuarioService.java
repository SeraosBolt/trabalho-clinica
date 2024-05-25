package br.unipar.programacaoweb.clinica2.service;

import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Tag(name = "Service do usuario", description = "Usuario")
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAll() {
        return this.usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    public Usuario login(Usuario usuario) {
        List<Usuario> userArray = this.usuarioRepository.findAll();
        for (Usuario user : userArray) {
            if (user.getNome().equals(usuario.getNome()) && user.getSenha().equals(usuario.getSenha())) {
                return user;
            }
        }
        return null;
    }

}
