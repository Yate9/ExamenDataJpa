package edu.lucas.examenreal.Repository;

import edu.lucas.examenreal.Entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {
    long countByCreditos(int creditos);
}
