package com.example.arquitp3.controllers;

import com.example.arquitp3.dtos.EstudianteDto;
import com.example.arquitp3.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.arquitp3.services.EstudianteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final String string = "/";
    @Autowired
    private EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @GetMapping("/")
    public Iterable<Estudiante> getEstudiantes() {
        return service.getAll();
    }

    @GetMapping("/orderByEdad")
    public Iterable<Estudiante> getEstudiantesOrderByEdad() {
        return service.getOrderByEdad();
    }

    @GetMapping("/byLU/{LU}")
    public Estudiante getByLibretaUniversitaria(@PathVariable long LU) {
        return service.getByLibretaUniversitaria(LU);
    }

    @GetMapping("/byGenero/{genero}")
    public Iterable<Estudiante> getByGenero(@PathVariable String genero) {
        return service.getAllByGenero(genero);
    }

    @PostMapping(string)
    public void addEstudiante(@RequestBody Estudiante estudiante) {
        service.post(estudiante);
    }

    @GetMapping("/byCarrera/{carrera}/filterByCiudadResidencia/{ciudad_residencia}")
    public Iterable<EstudianteDto> getAllByCarreraFilterByResidencia(@PathVariable String carrera, @PathVariable String ciudad_residencia) {
        return service.getAllByCarreraFilterByResidencia(carrera, ciudad_residencia);
    }


}
