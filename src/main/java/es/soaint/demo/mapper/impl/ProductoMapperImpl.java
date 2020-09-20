package es.soaint.demo.mapper.impl;

import es.soaint.demo.mapper.ProductoMapper;
import es.soaint.demo.model.api.request.ProductoRequest;
import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.dto.ProductoDto;
import es.soaint.demo.model.entity.ProductoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapperImpl implements ProductoMapper {
    @Override
    public ProductoDto requestToProductDto(ProductoRequest request) {
        return ProductoDto.builder()
                .nombre(request.getNombre())
                .precio(request.getPrecio())
                .build();
    }

    @Override
    public ProductoEntity productDtoToEntity(ProductoDto dto) {
        return ProductoEntity.builder()
                .nombre(dto.getNombre())
                .precio(dto.getPrecio())
                .build();
    }

    @Override
    public ProductoResponse productDtoToResponse(ProductoEntity entity) {
        return ProductoResponse.builder()
                .id(entity.getIdProducto())
                .nombre(entity.getNombre())
                .precio(entity.getPrecio())
                .build();
    }
}
