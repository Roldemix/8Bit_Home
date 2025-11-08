import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Integer id;

    @Column(name = "nombreUsuario", lenght = 40, nullable = false)
    private String nombre;

    @Column(name = "CorreoUsuario", lenght = 100, nullable = false)
    private String email;

    @Column(name = "contrasenaUsuario", lenght = 100, nullable = false)
    private String contrasena;
} 