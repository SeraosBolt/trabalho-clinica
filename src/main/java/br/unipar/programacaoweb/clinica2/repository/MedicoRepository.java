package br.unipar.programacaoweb.clinica2.repository;

import br.unipar.programacaoweb.clinica2.model.Medico;
import br.unipar.programacaoweb.clinica2.model.Usuario;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

@Tag(name = "Repository do medico", description = "Medico")
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
}
