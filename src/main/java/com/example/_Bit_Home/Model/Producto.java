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

    @Column(name = "nombreProducto", lenght = 40, nullable = false)
    private String nombre;

    @Column(name = "descripcionProducto", lenght = 150, nullable = false)
    private String descripcion;

    @Column(name = "PrecioProducto", nullable false)
    private Double precio;

    @Column(name = "StockProducto", nullable false)
    private Integer stock;

    @Column(name = "categoriaProducto", lenght = 40)

    @Column(name = "imagenProducto",nullable = false)
    private String imagen;

}