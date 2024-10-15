package com.example.arquitp3.dtos;

public class CarreraReporteDto {
        private long id_carrera;
        private String nombre_carrera;
        private  int cant_inscriptos;
        private  int cantidad_egresados;

    public CarreraReporteDto(long id_carrera, String nombre_carrera, int cant_inscriptos, int cantidad_egresados) {
        this.id_carrera = id_carrera;
        this.nombre_carrera = nombre_carrera;
        this.cant_inscriptos = cant_inscriptos;
        this.cantidad_egresados = cantidad_egresados;
    }
}
