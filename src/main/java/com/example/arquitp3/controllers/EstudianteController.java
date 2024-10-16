package com.example.arquitp3.controllers;

import com.example.arquitp3.dtos.EstudianteDto;
import com.example.arquitp3.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.arquitp3.services.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<EstudianteDto> getEstudiantes() {
        return service.getAll();
    }

    @GetMapping("/orderByEdad")
    public  List<EstudianteDto> getEstudiantesOrderByEdad() {
        return service.getOrderByEdad();
    }

    @GetMapping("/byLU/{LU}")
    public EstudianteDto getByLibretaUniversitaria(@PathVariable long LU) {
        return service.getByLibretaUniversitaria(LU);
    }

    @GetMapping("/byGenero/{genero}")
    public  List<EstudianteDto> getByGenero(@PathVariable String genero) {
        return service.getAllByGenero(genero);
    }

    @PostMapping("/")
    public void addEstudiante(@RequestBody Estudiante estudiante) {
        service.post(estudiante);
    }
    @PostMapping("/Many")
    public void addEstudiante(@RequestBody List<Estudiante> estudiantes) {
        for (Estudiante estudiante : estudiantes) {
        service.post(estudiante);
        }
    }

    @GetMapping("/byCarrera/{carrera}/filterByCiudadResidencia/{ciudad_residencia}")
    public List<EstudianteDto> getAllByCarreraFilterByResidencia(@PathVariable String carrera, @PathVariable String ciudad_residencia) {
        return service.getAllByCarreraFilterByResidencia(carrera, ciudad_residencia);
    }

    @DeleteMapping("/")
    public void deleteAll() {
        service.deleteAll();
    }
}
