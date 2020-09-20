package es.soaint.demo.model.entity;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "TBL_DETALLE_VENTA")
public class DetalleVentaEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleVenta;

    @OneToMany(cascade = CascadeType.ALL, fetch =  FetchType.EAGER)
    @JoinColumn(name = "idProducto")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<ProductoEntity> producto;

    @JoinColumn(name = "idVenta", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private VentaEntity venta;
}
