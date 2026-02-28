package sv.edu.udb.DesafioPractico1.repositorios;

import sv.edu.udb.DesafioPractico1.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Long>{
}
