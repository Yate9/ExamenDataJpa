package edu.lucas.examenreal.Repository;

import edu.lucas.examenreal.Entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {
    List<Matricula> findByCalificacionGreaterThanEqual(double nota);

    @Query(value = "SELECT e.nombre, e.apellidos FROM estudiante e INNER JOIN matricula m ON e.id = m.estudiante_id WHERE m.asignatura_codigo = :codigo", nativeQuery = true)
    List<Object[]> getEstudiantesMatriculadosPorAsignatura(String codigo);

}
