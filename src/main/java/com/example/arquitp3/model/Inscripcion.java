package com.example.arquitp3.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Inscripcion {

    @EmbeddedId
    private CarrerasCursadasPk pk_carreras_cursadas;

    @ManyToOne
    @MapsId("id_carrera") // PK de la entidad Carrera
    @JoinColumn(name = "id_carrera", referencedColumnName = "id_carrera", insertable = false, updatable = false)
    private Carrera carrera_cursada;

    @ManyToOne
    @MapsId("libreta_universitaria") // PK de la entidad Estudiante
    @JoinColumn(name = "id_estudiante", referencedColumnName = "libreta_universitaria", insertable = false, updatable = false)
    private Estudiante estudiante_en_curso;

    @Column
    private Date fecha_inscripcion;

    public Inscripcion(CarrerasCursadasPk pk_carreras_cursadas,
                       Carrera carrera_cursada, Estudiante estudiante_en_curso) {
        this.pk_carreras_cursadas = pk_carreras_cursadas;
        this.carrera_cursada = carrera_cursada;
        this.estudiante_en_curso = estudiante_en_curso;
        this.fecha_inscripcion = new Date(System.currentTimeMillis());
    }

    public Inscripcion() {

    }

}
