package com.example.arquitp3.utils;

import com.example.arquitp3.repositories.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import com.example.arquitp3.model.Estudiante;
import com.example.arquitp3.model.Carrera;
import com.example.arquitp3.repositories.EstudianteRepository;
import com.example.arquitp3.repositories.CarreraRepository;
import com.example.arquitp3.repositories.InscripcionRepository;

import org.springframework.util.ResourceUtils;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@Component
public class CargaDeDatos {

    private final EstudianteRepository estudianteRepository;
    private final CarreraRepository carreraRepository;
    private final InscripcionRepository inscripcionRepository;

    @Autowired
    public CargaDeDatos(EstudianteRepository estudianteRepository, CarreraRepository carreraRepository, InscripcionRepository inscripcionRepository) {
        this.estudianteRepository = estudianteRepository;
        this.carreraRepository = carreraRepository;
        this.inscripcionRepository = inscripcionRepository;
    }

    public void cargarDatosDesdeCSV() throws IOException {

        /*File EstudiantesCSV = ResourceUtils.getFile("src/main/java/com/example/arquitp3/csv/Estudiantes.csv");

        try (FileReader reader = new FileReader(EstudiantesCSV);
             CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)) {

            for (CSVRecord csvRecord : csvParser) {
                Estudiante estudiante = new Estudiante();
                estudiante.setLibreta_universitaria(Long.parseLong(csvRecord.get("libreta_universitaria")));
                if (!estudianteRepository.existsById(estudiante.getLibreta_universitaria())) {
                    estudiante.setNombre(csvRecord.get("nombre"));
                    estudiante.setApellido(csvRecord.get("apellido"));
                    estudiante.setEdad(Integer.parseInt(csvRecord.get("edad")));
                    estudiante.setGenero(csvRecord.get("genero"));
                    estudiante.setCiudad_residencia(csvRecord.get("ciudad_residencia"));
                    estudianteRepository.save(estudiante);
                }
            }
        }
*/
        estudianteRepository.save(new Estudiante(1,"Alan","Sherar",24,"Masculino","Tandil"));
        estudianteRepository.save(new Estudiante(2,"Joaquin","Cambareri",24,"Masculino","Necochea"));
        estudianteRepository.save(new Estudiante(3,"Valentin","Malassisi",24,"Masculino","Tandil"));
        estudianteRepository.save(new Estudiante(4,"Victoria","Ledesma",24,"Femenino","Necochea"));
        estudianteRepository.save(new Estudiante(5,"Paula","Manzalini",24,"Femenino","Tandil"));

        carreraRepository.save(new Carrera(1,"TUDAI",2));
        carreraRepository.save(new Carrera(2,"Ingenieria",5));
        carreraRepository.save(new Carrera(3,"Medicina",99));

        /*File CarrerasCSV = ResourceUtils.getFile("src/main/java/com/example/arquitp3/csv/Carreras.csv");

        try (FileReader reader = new FileReader(CarrerasCSV);
             CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)) {

            for (CSVRecord csvRecord : csvParser) {
                Carrera carrera = new Carrera();
                carrera.setId_carrera(Long.parseLong(csvRecord.get("id_carrera")));
                if (!carreraRepository.existsById(carrera.getId_carrera())) {
                    carrera.setNombre(csvRecord.get("nombre"));
                    carrera.setAnios(Integer.parseInt(csvRecord.get("anios")));
                    carreraRepository.save(carrera);
                }
            }
        }*/

    }
}

