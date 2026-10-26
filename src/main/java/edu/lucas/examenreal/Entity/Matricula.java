package edu.lucas.examenreal.Entity;

import edu.lucas.examenreal.Enum.Convocatoria;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDate fechaMatriculacion;
    @Column()
    private double calificacion;
    @Enumerated(EnumType.STRING)
    private Convocatoria convocatoria;
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;

}
