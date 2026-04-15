package sv.edu.udb.DesafioPractico1.controlador;

import sv.edu.udb.DesafioPractico1.entidades.Alumno;
import sv.edu.udb.DesafioPractico1.servicios.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping
    public List<Alumno> listar() { return service.listar(); }

    @PostMapping
    public Alumno guardar(@RequestBody Alumno a) { return service.guardar(a); }

    @GetMapping("/{id}")
    public Alumno buscar(@PathVariable Long id) { return service.buscar(id); }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { service.eliminar(id); }
}
