import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombreCategoria", length = 40, nullable = false)
    private String nombre;

    @Column(name = "descripcionCategoria", length = 150, nullable = false)
    private String descripcion;

    @Column(name = "tipoCategoria", length = 40)
    private String tipo;

}