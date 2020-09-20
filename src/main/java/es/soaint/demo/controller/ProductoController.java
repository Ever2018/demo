package es.soaint.demo.controller;

import es.soaint.demo.model.api.request.ProductoRequest;
import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.entity.ProductoEntity;
import es.soaint.demo.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/soaint/product")
public class ProductoController {

    private ProductoService service;

    @PostMapping(value = "/save", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ProductoResponse saveProduct(@Valid @RequestBody ProductoRequest request) {
        return service.saveProduct(request);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ProductoResponse updateProduct(@Valid @RequestBody ProductoRequest request) throws Exception {
        return service.updateProduct(request);
    }

    @GetMapping(value = "/list", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<ProductoEntity> listProducts() {
        return service.listProducts();
    }

    @GetMapping(value = "/find/{id}", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ProductoResponse findProductById(@Valid @PathVariable(name = "id") Integer id) throws Exception {
        return service.findProductById(id);
    }

    @DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    public void deleteProductById(@Valid @PathVariable(name = "id") Integer id) {
        service.deleteProductById(id);
    }
}
