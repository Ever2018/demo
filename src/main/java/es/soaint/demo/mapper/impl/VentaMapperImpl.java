package es.soaint.demo.mapper.impl;

import es.soaint.demo.mapper.VentaMapper;
import es.soaint.demo.model.api.request.ProductoRequest;
import es.soaint.demo.model.api.request.VentaRequest;
import es.soaint.demo.model.api.response.ClienteResponse;
import es.soaint.demo.model.api.response.DetalleVentaResponse;
import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.api.response.VentaResponse;
import es.soaint.demo.model.dto.ClienteDto;
import es.soaint.demo.model.dto.DetalleVentaDto;
import es.soaint.demo.model.dto.ProductoDto;
import es.soaint.demo.model.dto.VentaDto;
import es.soaint.demo.model.entity.ClienteEntity;
import es.soaint.demo.model.entity.DetalleVentaEntity;
import es.soaint.demo.model.entity.ProductoEntity;
import es.soaint.demo.model.entity.VentaEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class VentaMapperImpl implements VentaMapper {

    @Override
    public VentaDto requestToVentaDto(VentaRequest request) {
        return VentaDto.builder()
                .client(ClienteDto.builder()
                        .nombre(request.getClient().getNombre())
                        .apellido(request.getClient().getApellido())
                        .dni(request.getClient().getDni())
                        .telefono(request.getClient().getTelefono())
                        .email(request.getClient().getEmail())
                        .build())
                .fecha(request.getFecha())
                .detalleVenta(DetalleVentaDto.builder()
                        .productos(lisdDto(request.getDetalleVenta().getProductos()))
                        .build())
                .build();
    }

    @Override
    public VentaEntity dtoToVentaEntity(VentaDto dto) {
        return VentaEntity.builder()
                .client(ClienteEntity.builder()
                        .nombre(dto.getClient().getNombre())
                        .apellido(dto.getClient().getApellido())
                        .dni(dto.getClient().getDni())
                        .telefono(dto.getClient().getTelefono())
                        .email(dto.getClient().getEmail())
                        .build())
                .fecha(dto.getFecha())
                .build();
    }

    @Override
    public DetalleVentaEntity ventaToDetalle(VentaEntity entity, VentaDto dto) {
        return DetalleVentaEntity.builder()
                .venta(VentaEntity.builder()
                        .idVenta(entity.getIdVenta())
                        .fecha(entity.getFecha())
                        .client(entity.getClient())
                        .build())
                .producto(lisdEntity(dto.getDetalleVenta().getProductos()))
                .build();
    }

    @Override
    public VentaResponse entitiesToResponse(VentaEntity entity, DetalleVentaEntity detalleVentaEntity) {
        return VentaResponse.builder()
                .client(ClienteResponse.builder()
                        .dni(entity.getClient().getDni())
                        .telefono(entity.getClient().getTelefono())
                        .email(entity.getClient().getEmail())
                        .apellido(entity.getClient().getApellido())
                        .nombre(entity.getClient().getNombre())
                        .build())
                .fecha(entity.getFecha())
                .detalleVenta(DetalleVentaResponse.builder()
                        .productos(lisdResponse(detalleVentaEntity.getProducto()))
                        .build())
                .build();
    }

    private List<ProductoResponse> lisdResponse(List<ProductoEntity> entityList) {
        return entityList.stream()
                .map(request -> ProductoResponse.builder()
                        .nombre(request.getNombre())
                        .precio(request.getPrecio())
                        .build()).collect(Collectors.toList());
    }

    private List<ProductoEntity> lisdEntity(List<ProductoDto> dtoList) {
        return dtoList.stream()
                .map(request -> ProductoEntity.builder()
                        .nombre(request.getNombre())
                        .precio(request.getPrecio())
                        .build()).collect(Collectors.toList());
    }

    private List<ProductoDto> lisdDto(List<ProductoRequest> requestList) {
        return requestList.stream()
                .map(request -> ProductoDto.builder()
                        .nombre(request.getNombre())
                        .precio(request.getPrecio())
                .build()).collect(Collectors.toList());
    }
}
