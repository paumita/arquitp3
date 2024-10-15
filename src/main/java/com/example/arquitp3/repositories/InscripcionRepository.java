package com.example.arquitp3.repositories;

import com.example.arquitp3.dtos.CarreraDto;
import com.example.arquitp3.model.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {

    @Query("SELECT new com.example.arquitp3.dtos.CarreraDto(c.id_carrera, c.nombre, c.anios, COUNT(i)) " +
            "FROM Inscripcion i JOIN i.carrera_cursada c " +
            "GROUP BY c.id_carrera, c.nombre, c.anios " +
            "ORDER BY COUNT(i) DESC")
    List<CarreraDto> findCarrerasConInscriptosOrdenadasPorCantidad();
}
