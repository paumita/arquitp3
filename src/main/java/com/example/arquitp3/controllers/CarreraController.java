package com.example.arquitp3.controllers;

import com.example.arquitp3.dtos.CarreraDto;
import com.example.arquitp3.model.Carrera;
import com.example.arquitp3.services.CarreraService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/carreras")
public class CarreraController {

    @Autowired
    private CarreraService service;


    public CarreraController(CarreraService service) {
        this.service = service;
    }

    @GetMapping("/")
    public Iterable<Carrera> getAll() {
       return this.service.getAll();
    }

    @PostMapping("/")
    public void add(@RequestBody Carrera carrera) {
        service.post(carrera);
    }

}
