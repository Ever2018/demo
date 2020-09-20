package es.soaint.demo.mapper;

import es.soaint.demo.model.api.response.DetalleVentaResponse;
import es.soaint.demo.model.entity.DetalleVentaEntity;

public interface DetalleVentaMapper {
    DetalleVentaResponse entityToResponse(DetalleVentaEntity entity);
}
