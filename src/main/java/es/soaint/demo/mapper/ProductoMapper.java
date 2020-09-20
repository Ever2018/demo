package es.soaint.demo.mapper;

import es.soaint.demo.model.api.request.ProductoRequest;
import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.dto.ProductoDto;
import es.soaint.demo.model.entity.ProductoEntity;

public interface ProductoMapper {
    ProductoDto requestToProductDto(ProductoRequest request);
    ProductoEntity productDtoToEntity(ProductoDto dto);
    ProductoResponse productDtoToResponse(ProductoEntity entity);
}
