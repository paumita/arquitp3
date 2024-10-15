package com.example.arquitp3.services;

import com.example.arquitp3.dtos.CarreraDto;
import com.example.arquitp3.model.Carrera;
import com.example.arquitp3.repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {

    @Autowired
    private CarreraRepository repository;

    public void post(Carrera carrera) {
        repository.save(carrera);
    }

    public Iterable<Carrera> getAll() {
        return repository.findAll();
    }

}
