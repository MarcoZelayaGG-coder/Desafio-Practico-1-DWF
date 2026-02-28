package sv.edu.udb.DesafioPractico1.repositorios;

import sv.edu.udb.DesafioPractico1.entidades.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepositorio extends JpaRepository<Materia, Long>{
}
