package com.example.arquitp3.dtos;
import lombok.Data;

@Data
public class CarreraDto {

    private long id_carrera;
    private String nombre;
    private int Anios;
    private long cantidadInscriptos;

    public CarreraDto(long id_carrera, String nombre, int anios, long cantidadInscriptos) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
        this.Anios = anios;
        this.cantidadInscriptos = cantidadInscriptos;
    }
}
