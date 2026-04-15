package sv.edu.udb.DesafioPractico1.controlador;

import sv.edu.udb.DesafioPractico1.entidades.Profesor;
import sv.edu.udb.DesafioPractico1.servicios.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService service;

    @GetMapping
    public List<Profesor> listar() { return service.listar(); }

    @PostMapping
    public Profesor guardar(@RequestBody Profesor p) { return service.guardar(p); }

    @GetMapping("/{id}")
    public Profesor buscar(@PathVariable Long id) { return service.buscar(id); }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { service.eliminar(id); }
}
