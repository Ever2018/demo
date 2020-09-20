package es.soaint.demo.model.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize(as=ClienteRequest.class)
public class ClienteRequest implements Serializable {

    private static final long serialVersionUID = 5235254910809137724L;

    @NotNull
    @NotEmpty
    private String nombre;

    @NotNull
    @NotEmpty
    private String apellido;

    @NotNull
    @NotEmpty
    @Size(min = 8)
    private String dni;

    @NotNull
    @NotEmpty
    @Size(min = 8, max = 13)
    private String telefono;

    @NotNull
    @NotEmpty
    @Email
    private String email;
}
