package es.soaint.demo.model.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize(as=VentaRequest.class)
public class VentaRequest implements Serializable {

    private static final long serialVersionUID = 3235254910809137724L;

    @NotNull
    @NotEmpty
    @Valid
    private ClienteRequest client;

    @NotNull
    @NotEmpty
    private Date fecha;

    @NotNull
    @NotEmpty
    @Valid
    private DetalleVentaRequest detalleVenta;

}
