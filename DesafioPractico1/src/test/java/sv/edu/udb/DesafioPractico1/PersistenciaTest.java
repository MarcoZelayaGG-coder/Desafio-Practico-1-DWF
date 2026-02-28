package sv.edu.udb.DesafioPractico1;
import sv.edu.udb.DesafioPractico1.entidades.Alumno;
import sv.edu.udb.DesafioPractico1.entidades.Materia;
import sv.edu.udb.DesafioPractico1.entidades.Profesor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.DesafioPractico1.repositorios.AlumnoRepositorio;
import sv.edu.udb.DesafioPractico1.repositorios.MateriaRepositorio;
import sv.edu.udb.DesafioPractico1.repositorios.ProfesorRepositorio;

import java.util.Arrays;

@SpringBootTest
public class PersistenciaTest {
    @Autowired private ProfesorRepositorio profesorRepositorio;
    @Autowired private MateriaRepositorio materiaRepositorio;
    @Autowired private AlumnoRepositorio alumnoRepositorio;

    @Test
    @Transactional
    @Commit // usamos commit para que los datos se queden en h2 y poder verlos en el navegador

    void registrarDatosDesafio() {
        // agregar porfesorex
        Profesor p1 = new Profesor(); p1.setNombre("Catedrático 1");
        Profesor p2 = new Profesor(); p2.setNombre("Catedrático 2");
        profesorRepositorio.save(p1);
        profesorRepositorio.save(p2);

        // agregar materias
        Materia m1 = new Materia(); m1.setNombre("Java Avanzado"); m1.setProfesor(p1);
        Materia m2 = new Materia(); m2.setNombre("Bases de Datos II"); m2.setProfesor(p2);
        materiaRepositorio.save(m1);
        materiaRepositorio.save(m2);

        //agregar alumnos
        Alumno a1 = new Alumno(); a1.setNombre("Carlos"); a1.setApellido("Armas");
        a1.setMaterias(Arrays.asList(m1, m2));

        Alumno a2 = new Alumno(); a2.setNombre("Elena"); a2.setApellido("Pérez");
        a2.setMaterias(Arrays.asList(m1));

        alumnoRepositorio.save(a1);
        alumnoRepositorio.save(a2);
    }
}
