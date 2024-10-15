package com.example.arquitp3.repositories;

import com.example.arquitp3.model.Carrera;
import com.example.arquitp3.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CarreraRepository extends JpaRepository<Carrera, Long> {

}
