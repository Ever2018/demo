package es.soaint.demo.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {

    private String nombre;

    private String apellido;

    private String dni;

    private String telefono;

    private String email;

}
