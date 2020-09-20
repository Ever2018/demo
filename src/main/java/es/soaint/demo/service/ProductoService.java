package es.soaint.demo.service;

import es.soaint.demo.model.api.request.ProductoRequest;
import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.entity.ProductoEntity;

import java.util.List;

public interface ProductoService {
    ProductoResponse saveProduct(ProductoRequest request);
    ProductoResponse updateProduct(ProductoRequest request) throws Exception;
    List<ProductoEntity> listProducts();
    ProductoResponse findProductById(Integer id) throws Exception;
    void deleteProductById(Integer id);
}
