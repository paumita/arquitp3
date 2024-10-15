package com.example.arquitp3.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CarrerasCursadasPk implements Serializable {

    private long id_carrera;
    private long libreta_universitaria;

    public CarrerasCursadasPk(long id_carrera, long libreta_universitaria) {
        this.id_carrera = id_carrera;
        this.libreta_universitaria = libreta_universitaria;
    }

    public CarrerasCursadasPk() {
    }

    public long getIdCarrera() {
        return id_carrera;
    }

    public void setIdCarrera(long id_carrera) {
        this.id_carrera = id_carrera;
    }

    public long getIdEstudiante() {
        return libreta_universitaria;
    }

    public void setIdEstudiante(long libreta_universitaria) {
        this.libreta_universitaria = libreta_universitaria;
    }

}
