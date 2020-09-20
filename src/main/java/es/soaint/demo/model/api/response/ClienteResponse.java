package es.soaint.demo.model.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ClienteResponse {

    private Integer id;

    private String nombre;

    private String apellido;

    private String dni;

    private String telefono;

    private String email;
}
