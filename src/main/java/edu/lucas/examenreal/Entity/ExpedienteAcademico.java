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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getNotaMediaAcceso() {
        return notaMediaAcceso;
    }

    public void setNotaMediaAcceso(double notaMediaAcceso) {
        this.notaMediaAcceso = notaMediaAcceso;
    }
    @Override
    public String toString() {
        return "ExpedienteAcademico{" +
                "id=" + id +
                ", numeroExpediente='" + numeroExpediente + '\'' +
                ", fechaApertura=" + fechaApertura +
                ", notaMediaAcceso=" + notaMediaAcceso +
                '}';
    }
}
