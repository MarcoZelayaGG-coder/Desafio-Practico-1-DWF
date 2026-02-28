package sv.edu.udb.DesafioPractico1.repositorios;

import sv.edu.udb.DesafioPractico1.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long>  {
}
