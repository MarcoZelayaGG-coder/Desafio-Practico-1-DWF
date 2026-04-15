package sv.edu.udb.DesafioPractico1.servicios;

import sv.edu.udb.DesafioPractico1.entidades.Materia;
import sv.edu.udb.DesafioPractico1.repositorios.MateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepositorio repository;

    public List<Materia> listar() { return repository.findAll(); }
    public Materia guardar(Materia m) { return repository.save(m); }
    public Materia buscar(Long id) { return repository.findById(id).orElse(null); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
