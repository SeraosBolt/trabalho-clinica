package br.unipar.programacaoweb.clinica2.repository;

import br.unipar.programacaoweb.clinica2.model.Paciente;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

@Tag(name = "Repository do paciente", description = "Paciente")
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
