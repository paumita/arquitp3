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

    public List<EstudianteDto> getAll() {
        return repository.findAllDto();
    }

    public EstudianteDto getByLibretaUniversitaria(long LU) {
        return repository.findByLibretaUniversitaria(LU);
    }

    public List<EstudianteDto> getAllByGenero(String genero) {
        return repository.findAllByGenero(genero);
    }

    public List<EstudianteDto> getOrderByEdad() {
        return repository.findAllOrderByEdad();
    }

    public List<EstudianteDto> getAllByCarreraFilterByResidencia(String carrera, String residencia) {
        List<EstudianteDto> consulta = repository.findAllByCarreraFilterByResidencia(carrera, residencia);
        return consulta;
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}




