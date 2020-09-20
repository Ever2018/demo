package es.soaint.demo.dao;

import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.dto.ProductoDto;
import es.soaint.demo.model.entity.ProductoEntity;

import java.util.List;

public interface ProductoDao {
    ProductoResponse saveProduct(ProductoDto dto);
    ProductoResponse updateProduct(ProductoDto dto) throws Exception;
    List<ProductoEntity> listProduct();
    ProductoResponse findProduct(Integer id) throws Exception;
    void deleteProduct(Integer id);
}
