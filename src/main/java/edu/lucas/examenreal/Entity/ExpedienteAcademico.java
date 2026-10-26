package edu.lucas.examenreal.Entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="expedientes")
public class ExpedienteAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String numeroExpediente;
    @Column(nullable = false)
    private LocalDate fechaApertura;
    @Column(nullable = false)
    private double notaMediaAcceso ;


}
