package es.soaint.demo.controller;

import es.soaint.demo.model.api.response.DetalleVentaResponse;
import es.soaint.demo.service.DetalleVentaService;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("/soaint/rxjava2")
public class RestRxjavaController {

    private DetalleVentaService service;

    @GetMapping(value = "/find/{id}", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    Single<DetalleVentaResponse> findDetailByIdVenta(@Valid @PathVariable(name = "id") Integer id) throws Exception {
        return service.findDetailByIdVenta(id);
    }
}
