package wikigroup.taller.demo.entidad;

import org.hibernate.annotations.SQLDelete;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class contactenos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private int semestre;
    private String descripcion;
    
    public contactenos (String nombre, String apellido, String correo, int semestre, String decripcion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.semestre = semestre;
        this.descripcion = decripcion;
    }
}



