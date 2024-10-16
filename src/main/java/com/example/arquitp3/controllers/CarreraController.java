package com.example.arquitp3.controllers;

import com.example.arquitp3.dtos.CarreraDto;
import com.example.arquitp3.dtos.CarreraReporteDto;
import com.example.arquitp3.model.Carrera;
import com.example.arquitp3.services.CarreraService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/carreras")
public class CarreraController {

    @Autowired
    private CarreraService service;

    public CarreraController(CarreraService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<CarreraDto> getAll() {
       return this.service.getAll();
    }

    @PostMapping("/")
    public void add(@RequestBody Carrera carrera) {
        service.post(carrera);
    }

    @GetMapping("/byInscriptos")
    public List<CarreraDto> getAllCarrerasConInscriptosOrderByCantInscriptos(){
        return service.getAllCarrerasConInscriptosOrderByCantInscriptos();
    }
    @GetMapping("/getReporte")

    public List<CarreraReporteDto> getReporteCarreras(){
        return service.getReporteCarreras();
    }

    @DeleteMapping("/")
    public void deleteAll() {
        service.deleteAll();
    }
}
