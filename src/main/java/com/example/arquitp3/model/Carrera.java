package com.example.arquitp3.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Carrera {

    @Id
    private long id_carrera;

    @Column
    private String nombre;

    @Column
    private int anios;

    @OneToMany(mappedBy = "carrera_cursada")
    private List<Inscripcion> estudiantes;

    public Carrera(){}

    public Carrera(long id_carrera, String nombre, int anios) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
        this.anios = anios;
    }

}
