package com.example.arquitp3.model;

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
    public long getLibretaUniversitaria() {
        return libreta_universitaria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getCiudadResidencia() {
        return ciudad_residencia;
    }
}


