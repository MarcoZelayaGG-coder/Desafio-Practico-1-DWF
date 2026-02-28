package sv.edu.udb.DesafioPractico1.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    //Getter y setter
    public Long getId(){ return id;}
    public void setId(Long id){this.id=id;}
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
