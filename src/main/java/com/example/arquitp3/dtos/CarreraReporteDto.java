package com.example.arquitp3.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class CarreraReporteDto {
        private long id_carrera;
        private String nombre_carrera;
        private long cant_inscriptos;
        private long cantidad_egresados;
        private int fecha_inscripcion;

    public CarreraReporteDto(long id_carrera, String nombre_carrera, long cant_inscriptos, long cantidad_egresados, int fecha_inscripcion) {
        this.id_carrera = id_carrera;
        this.nombre_carrera = nombre_carrera;
        this.cant_inscriptos = cant_inscriptos;
        this.cantidad_egresados = cantidad_egresados;
        this.fecha_inscripcion = fecha_inscripcion;
    }
}
