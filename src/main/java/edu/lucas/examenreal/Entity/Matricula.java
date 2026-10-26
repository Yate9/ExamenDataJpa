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
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;
    @ManyToOne
    @JoinColumn(name = "id_asignatura")
    private Asignatura asignatura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }


    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", calificacion=" + calificacion +
                ", convocatoria=" + convocatoria +
                ", estudiante=" + estudiante +
                ", asignatura=" + asignatura +
                '}';
    }


}
