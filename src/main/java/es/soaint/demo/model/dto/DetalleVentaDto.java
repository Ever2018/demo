package es.soaint.demo.model.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVentaDto {

    private List<ProductoDto> productos;

}
