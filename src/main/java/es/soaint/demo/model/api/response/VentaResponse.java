package es.soaint.demo.model.api.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class VentaResponse {

    private Integer id;

    private ClienteResponse client;

    private Date fecha;

    private DetalleVentaResponse detalleVenta;
}
