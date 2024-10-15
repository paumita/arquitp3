package com.example.arquitp3.dtos;
import lombok.Data;

@Data
public class CarreraDto {

    private long id_carrera;
    private String nombre;
    private int anios;
    private long cantidad_inscriptos;

    public CarreraDto(long id_carrera, String nombre, int anios, long cantidadInscriptos) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
        this.anios = anios;
        this.cantidad_inscriptos = cantidadInscriptos;
    }
}
