package com.example.arquitp3.dtos;

import com.example.arquitp3.model.CarrerasCursadasPk;
import lombok.Data;

import java.util.Date;

@Data
public class InscripcionDto {
    private CarrerasCursadasPk carrerasCursadasPk;
    private Date fecha_inscripcion;
    private Date fecha_graduacion;
    private Long libreta_universitaria;
    private String nombre_estudiante;
    private String apellido_estudiante;
    private String nombre_carrera;

    public InscripcionDto(CarrerasCursadasPk carrerasCursadasPk, Date fecha_inscripcion, Date fecha_graduacion, Long libreta_universitaria, String nombre_estudiante, String apellido_estudiante, String nombre_carrera) {
        this.carrerasCursadasPk = carrerasCursadasPk;
        this.fecha_inscripcion = fecha_inscripcion;
        this.fecha_graduacion = fecha_graduacion;
        this.libreta_universitaria = libreta_universitaria;
        this.nombre_estudiante = nombre_estudiante;
        this.apellido_estudiante = apellido_estudiante;
        this.nombre_carrera = nombre_carrera;
    }

}
