package com.example.arquitp3.controllers;

import com.example.arquitp3.dtos.CarreraDto;
import com.example.arquitp3.model.Estudiante;
import com.example.arquitp3.model.Inscripcion;
import com.example.arquitp3.services.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inscripcion")
public class InscripcionController {

    @Autowired
    private InscripcionService service;


    @PostMapping("/inscribirEstudiante/{LU}/{idCarrera}")
    public void add(@PathVariable Long LU, @PathVariable Long idCarrera){
        this.service.inscribirEstudiante(LU, idCarrera);
    }

    @GetMapping("/")
    public Iterable<Inscripcion> getInscripciones() {
        return service.getAll();
    }

    @GetMapping("/carreraInscriptos")
    public Iterable<CarreraDto> getCarreras() {
        return this.service.getCarrerasConInscriptos();
    }

}
