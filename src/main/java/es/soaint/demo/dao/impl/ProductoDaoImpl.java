package es.soaint.demo.dao.impl;

import es.soaint.demo.dao.ProductoDao;
import es.soaint.demo.dao.repository.ProductoRepository;
import es.soaint.demo.mapper.ProductoMapper;
import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.dto.ProductoDto;
import es.soaint.demo.model.entity.ProductoEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class ProductoDaoImpl implements ProductoDao {

    private ProductoRepository repository;

    private ProductoMapper mapper;

    @Override
    public ProductoResponse saveProduct(ProductoDto dto) {
        ProductoEntity entity = repository.save(mapper.productDtoToEntity(dto));
        return mapper.productDtoToResponse(entity);
    }

    @Override
    public ProductoResponse updateProduct(ProductoDto dto) throws Exception {
        ProductoEntity entity = repository.findById(dto.getId()).orElse(null);
        if (entity == null) {
            throw new Exception("");
        }
        repository.save(entity);
        return mapper.productDtoToResponse(entity);
    }

    @Override
    public List<ProductoEntity> listProduct() {
        return (List<ProductoEntity>) repository.findAll();
    }

    @Override
    public ProductoResponse findProduct(Integer id) throws Exception {
        ProductoEntity entity = repository.findById(id).orElse(null);
        if (entity == null) {
            throw new Exception("");
        }
        return mapper.productDtoToResponse(entity);
    }

    @Override
    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }
}
