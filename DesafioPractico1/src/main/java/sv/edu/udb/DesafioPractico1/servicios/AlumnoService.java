package sv.edu.udb.DesafioPractico1.servicios;

import sv.edu.udb.DesafioPractico1.entidades.Alumno;
import sv.edu.udb.DesafioPractico1.repositorios.AlumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepositorio repository;

    public List<Alumno> listar() { return repository.findAll(); }
    public Alumno guardar(Alumno a) { return repository.save(a); }
    public Alumno buscar(Long id) { return repository.findById(id).orElse(null); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
