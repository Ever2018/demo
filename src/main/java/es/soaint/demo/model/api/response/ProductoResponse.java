package es.soaint.demo.model.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductoResponse {

    private Integer id;

    private String nombre;

    private Double precio;
}
