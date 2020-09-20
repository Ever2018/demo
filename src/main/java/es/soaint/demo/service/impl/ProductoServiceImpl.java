package es.soaint.demo.service.impl;

import es.soaint.demo.dao.ProductoDao;
import es.soaint.demo.mapper.ProductoMapper;
import es.soaint.demo.model.api.request.ProductoRequest;
import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.entity.ProductoEntity;
import es.soaint.demo.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private ProductoDao dao;

    private ProductoMapper mapper;

    @Override
    public ProductoResponse saveProduct(ProductoRequest request) {
        return dao.saveProduct(mapper.requestToProductDto(request));
    }

    @Override
    public ProductoResponse updateProduct(ProductoRequest request) throws Exception {
        return dao.updateProduct(mapper.requestToProductDto(request));
    }

    @Override
    public List<ProductoEntity> listProducts() {
        return dao.listProduct();
    }

    @Override
    public ProductoResponse findProductById(Integer id) throws Exception {
        return dao.findProduct(id);
    }

    @Override
    public void deleteProductById(Integer id) {
        dao.deleteProduct(id);
    }
}
