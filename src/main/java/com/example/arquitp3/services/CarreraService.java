package com.example.arquitp3.services;

import com.example.arquitp3.dtos.CarreraDto;
import com.example.arquitp3.dtos.CarreraReporteDto;
import com.example.arquitp3.model.Carrera;
import com.example.arquitp3.repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraService {

    @Autowired
    private CarreraRepository repository;

    public void post(Carrera carrera) {
        repository.save(carrera);
    }

    public List<CarreraDto> getAll() {
        return repository.findAllDto();
    }

    public List<CarreraDto> getAllCarrerasConInscriptosOrderByCantInscriptos() {
        return this.repository.findAllDtoConInscriptosOrderByCantInscriptos();
    }

    public List<CarreraReporteDto> getReporteCarreras() {
        return repository.getReporte();
    }

    public void deleteAll() {
        repository.deleteAll();
    }

}
