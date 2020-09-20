package es.soaint.demo.model.api.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class DetalleVentaResponse {

    private Integer idDetalleVenta;

    private List<ProductoResponse> productos;

    private VentaResponse venta;

}
