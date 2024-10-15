package com.example.arquitp3.services;
import com.example.arquitp3.dtos.EstudianteDto;
import com.example.arquitp3.model.Estudiante;
import com.example.arquitp3.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.repository = estudianteRepository;
    }

    public void post(Estudiante estudiante) {
        repository.save(estudiante);
    }

    public Iterable<Estudiante> getAll() {
        return repository.findAll();
    }

    public Estudiante getByLibretaUniversitaria(long LU) {
        return repository.findByLibretaUniversitaria(LU);
    }

    public Iterable<Estudiante> getAllByGenero(String genero) {
        return repository.findAllByGenero(genero);
    }

    public Iterable<Estudiante> getOrderByEdad() {
        return repository.findAllOrderByEdad();
    }

    /*public Iterable<EstudianteDto> getAllByCarreraFilterByResidencia(String carrera, String residencia) {
        return repository.findAllByCarreraFilterByResidencia(carrera, residencia);
    }*/

    public List<EstudianteDto> getAllByCarreraFilterByResidencia(String carrera, String residencia) {
        List<EstudianteDto> consulta = repository.findAllByCarreraFilterByResidencia(carrera, residencia);
        return consulta;
    }
}




