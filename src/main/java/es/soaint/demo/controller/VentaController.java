package es.soaint.demo.controller;

import es.soaint.demo.model.api.request.VentaRequest;
import es.soaint.demo.model.api.response.VentaResponse;
import es.soaint.demo.model.entity.VentaEntity;
import es.soaint.demo.service.VentaService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/soaint/sale")
public class VentaController {

    private VentaService service;

    @PostMapping(value = "/save", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    public VentaResponse saveClient(@Valid @RequestBody VentaRequest request) {
        return service.saveSale(request);
    }

    @GetMapping(value = "/list", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<VentaEntity> listSales() {
        return service.listSales();
    }

}
