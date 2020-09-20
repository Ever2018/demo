package es.soaint.demo.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaDto {

    private ClienteDto client;

    private Date fecha;

    private DetalleVentaDto detalleVenta;
}
