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
}
