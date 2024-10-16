package com.example.arquitp3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Estudiante {

    @Id
    private long libreta_universitaria;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private int edad;

    @Column
    private String genero;

    @Column
    private String ciudad_residencia;

    @JsonIgnoreProperties(value = { "estudiante_en_curso" }, allowSetters = true)
    @OneToMany(mappedBy = "estudiante_en_curso")
    private List<Inscripcion> carreras;
 

    public Estudiante() {

    }

    public Estudiante(long libreta_universitaria, String nombre, String apellido, int edad, String genero, String ciudad_residencia) {
        this.libreta_universitaria = libreta_universitaria;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.ciudad_residencia = ciudad_residencia;
    }

}


