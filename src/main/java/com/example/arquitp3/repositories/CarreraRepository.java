package com.example.arquitp3.repositories;

import com.example.arquitp3.dtos.CarreraDto;
import com.example.arquitp3.dtos.CarreraReporteDto;
import com.example.arquitp3.model.Carrera;
import com.example.arquitp3.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CarreraRepository extends JpaRepository<Carrera, Long> {

    @Query("SELECT new com.example.arquitp3.dtos.CarreraDto(c.id_carrera, c.nombre, c.anios, SIZE(c.estudiantes)) " +
            "FROM Carrera c")
    public List<CarreraDto> findAllDto();

    @Query("SELECT new com.example.arquitp3.dtos.CarreraDto(c.id_carrera, c.nombre, c.anios, SIZE(c.estudiantes)) AS countI " +
            "from Carrera c where SIZE(c.estudiantes) > 0 order by SIZE(c.estudiantes) ASC ")
    public List<CarreraDto> findAllDtoConInscriptosOrderByCantInscriptos();

    @Query("SELECT new com.example.arquitp3.dtos.CarreraReporteDto(" +
            "c.id_carrera, " +
            "c.nombre, " +
            "COUNT(i.fecha_inscripcion), " +
            "COUNT(i.fecha_graduacion)," +
            "YEAR(i.fecha_inscripcion))"+
            "FROM Carrera c " +
            "LEFT JOIN Inscripcion i ON i.carrera_cursada.id_carrera = c.id_carrera " +
            "GROUP BY c.id_carrera, c.nombre, YEAR(i.fecha_inscripcion) " +
            "ORDER BY c.nombre ASC, YEAR(i.fecha_inscripcion) ASC")
    public List<CarreraReporteDto> getReporte();

}
