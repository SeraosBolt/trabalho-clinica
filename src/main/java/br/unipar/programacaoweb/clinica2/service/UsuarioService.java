package br.unipar.programacaoweb.clinica2.service;

import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Tag(name = "Service do Usuario", description = "Usuario")
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Operation(summary = "Obter todos os usuários", description = "Retorna uma lista de todos os usuários cadastrados no sistema.")
    public List<Usuario> getAll() {
        return this.usuarioRepository.findAll();
    }

    @Operation(summary = "Salvar usuário", description = "Salva um novo usuário no sistema.")
    public Usuario save(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Operation(summary = "Login do usuário", description = "Realiza o login do usuário.")
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
