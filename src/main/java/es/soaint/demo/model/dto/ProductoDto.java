package es.soaint.demo.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ProductoDto {

    private Integer id;

    private String nombre;

    private Double precio;

}
