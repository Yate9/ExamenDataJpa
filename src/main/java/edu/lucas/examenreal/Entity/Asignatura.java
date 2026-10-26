package edu.lucas.examenreal.Entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="asignaturas")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int creditos;
    @Column(nullable = false, unique = true)
    private String codigo;
    @OneToMany(mappedBy = "asignatura")
    private Set<Matricula> matriculas;
}
