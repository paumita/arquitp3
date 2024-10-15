package com.example.arquitp3.services;

import com.example.arquitp3.dtos.CarreraDto;
import com.example.arquitp3.model.Carrera;
import com.example.arquitp3.model.CarrerasCursadasPk;
import com.example.arquitp3.model.Estudiante;
import com.example.arquitp3.model.Inscripcion;
import com.example.arquitp3.repositories.CarreraRepository;
import com.example.arquitp3.repositories.EstudianteRepository;
import com.example.arquitp3.repositories.InscripcionRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class InscripcionService {

    @Autowired
    private InscripcionRepository repository;

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private CarreraRepository carreraRepository;

    public InscripcionService(InscripcionRepository inscripcionRepository) {
        this.repository = inscripcionRepository;
    }

    public void inscribirEstudiante(long LU, long idCarrera) {
        if(estudianteRepository.existsById(LU) && carreraRepository.existsById(idCarrera)) {
            Carrera carrera = carreraRepository.findById(idCarrera).get();
            Estudiante estudiante = estudianteRepository.findById(LU).get();
            CarrerasCursadasPk cc = new CarrerasCursadasPk(idCarrera,LU);
            Inscripcion inscripcion = new Inscripcion(cc,carrera,estudiante);
            repository.save(inscripcion);
        }
    }

    public Iterable<Inscripcion> getAll() {
        return repository.findAll();
    }

    public Iterable<CarreraDto> getCarrerasConInscriptos(){
        return this.repository.findCarrerasConInscriptosOrdenadasPorCantidad();
    }

}
