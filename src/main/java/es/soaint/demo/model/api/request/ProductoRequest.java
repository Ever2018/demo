package es.soaint.demo.model.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize(as=ProductoRequest.class)
public class ProductoRequest implements Serializable {

    private static final long serialVersionUID = 1235254910809137724L;

    private Integer id;

    @NotNull
    @NotEmpty
    private String nombre;

    @NotNull
    @NotEmpty
    private Double precio;
}
