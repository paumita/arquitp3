package com.example.arquitp3.repositories;

import com.example.arquitp3.dtos.EstudianteDto;
import com.example.arquitp3.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    @Query("SELECT new com.example.arquitp3.dtos.EstudianteDto(e.libreta_universitaria,e.nombre,e.apellido,e.edad,e.genero, e.ciudad_residencia)" +
            "FROM Estudiante e")
    List<EstudianteDto> findAllDto();

    @Query("SELECT new com.example.arquitp3.dtos.EstudianteDto(e.libreta_universitaria,e.nombre,e.apellido,e.edad,e.genero,e.ciudad_residencia)" +
            "FROM Estudiante e ORDER BY e.edad")
    List<EstudianteDto> findAllOrderByEdad();

    @Query("SELECT new com.example.arquitp3.dtos.EstudianteDto(e.libreta_universitaria, e.nombre, e.apellido, e.edad, e.genero, e.ciudad_residencia) " +
            "FROM Estudiante e WHERE e.libreta_universitaria = :libreta_universitaria")
    EstudianteDto findByLibretaUniversitaria(long libreta_universitaria);

    @Query("SELECT new com.example.arquitp3.dtos.EstudianteDto(e.libreta_universitaria, e.nombre, e.apellido, e.edad, e.genero, e.ciudad_residencia) " +
            "FROM Estudiante e WHERE e.genero = :genero")
    List<EstudianteDto> findAllByGenero(String genero);

    @Query("SELECT new com.example.arquitp3.dtos.EstudianteDto(e.libreta_universitaria, e.nombre, e.apellido, e.edad, e.genero, e.ciudad_residencia, cc.fecha_inscripcion) " +
            "FROM Estudiante e " +
            "JOIN e.carreras cc " +
            "JOIN cc.carrera_cursada c " +
            "WHERE c.nombre = :carrera AND e.ciudad_residencia = :ciudad")
    List<EstudianteDto> findAllByCarreraFilterByResidencia(String carrera, String ciudad);

}

