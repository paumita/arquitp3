package com.example.arquitp3.dtos;
import lombok.Data;

import java.util.Date;

@Data
public class EstudianteDto {

    private long libreta_universitaria;
    private String nombre;
    private String apellido;
    private int edad;
    private String ciudad_residencia;
    private Date fechaInscripcion;

    public EstudianteDto(long libreta_universitaria, String nombre, String apellido, int edad, String ciudad_residencia, Date fechaInscripcion) {
        this.libreta_universitaria = libreta_universitaria;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad_residencia = ciudad_residencia;
        this.fechaInscripcion = fechaInscripcion;
    }

}
