package edu.lucas.examenreal.Entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String dni;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellidos;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_expediente")
    private ExpedienteAcademico expedienteAcademico;
    @OneToMany(mappedBy = "estudiante")
    private Set<Matricula> matriculas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public ExpedienteAcademico getExpedienteAcademico() {
        return expedienteAcademico;
    }

    public void setExpedienteAcademico(ExpedienteAcademico expedienteAcademico) {
        this.expedienteAcademico = expedienteAcademico;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", expedienteAcademico=" + expedienteAcademico +
                ", matriculas=" + matriculas +
                '}';
    }
}

