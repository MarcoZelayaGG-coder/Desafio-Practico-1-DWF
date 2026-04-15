package sv.edu.udb.DesafioPractico1.controlador;

import sv.edu.udb.DesafioPractico1.entidades.Materia;
import sv.edu.udb.DesafioPractico1.servicios.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaService service;

    @GetMapping
    public List<Materia> listar() { return service.listar(); }

    @PostMapping
    public Materia guardar(@RequestBody Materia m) { return service.guardar(m); }

    @GetMapping("/{id}")
    public Materia buscar(@PathVariable Long id) { return service.buscar(id); }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { service.eliminar(id); }
}
