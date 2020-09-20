package es.soaint.demo.mapper;

import es.soaint.demo.model.api.request.VentaRequest;
import es.soaint.demo.model.api.response.VentaResponse;
import es.soaint.demo.model.dto.VentaDto;
import es.soaint.demo.model.entity.DetalleVentaEntity;
import es.soaint.demo.model.entity.VentaEntity;

public interface VentaMapper {
    VentaDto requestToVentaDto(VentaRequest request);
    VentaEntity dtoToVentaEntity(VentaDto dto);
    DetalleVentaEntity ventaToDetalle(VentaEntity entity, VentaDto dto);
    VentaResponse entitiesToResponse(VentaEntity entity, DetalleVentaEntity detalleVentaEntity);
}
