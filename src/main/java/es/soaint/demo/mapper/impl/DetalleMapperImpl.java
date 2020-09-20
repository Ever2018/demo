package es.soaint.demo.mapper.impl;

import es.soaint.demo.mapper.DetalleVentaMapper;
import es.soaint.demo.model.api.response.ClienteResponse;
import es.soaint.demo.model.api.response.DetalleVentaResponse;
import es.soaint.demo.model.api.response.ProductoResponse;
import es.soaint.demo.model.api.response.VentaResponse;
import es.soaint.demo.model.entity.DetalleVentaEntity;
import es.soaint.demo.model.entity.ProductoEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DetalleMapperImpl implements DetalleVentaMapper {

    @Override
    public DetalleVentaResponse entityToResponse(DetalleVentaEntity entity) {
        return DetalleVentaResponse.builder()
                .idDetalleVenta(entity.getIdDetalleVenta())
                .productos(productoResponseList(entity.getProducto()))
                .venta(VentaResponse.builder()
                        .id(entity.getVenta().getIdVenta())
                        .client(ClienteResponse.builder()
                                .id(entity.getVenta().getClient().getIdCliente())
                                .nombre(entity.getVenta().getClient().getNombre())
                                .apellido(entity.getVenta().getClient().getApellido())
                                .email(entity.getVenta().getClient().getEmail())
                                .telefono(entity.getVenta().getClient().getTelefono())
                                .dni(entity.getVenta().getClient().getDni())
                                .build())
                        .fecha(entity.getVenta().getFecha())
                        .build())
                .build();
    }

    private List<ProductoResponse> productoResponseList(List<ProductoEntity> entity) {
        return entity.stream()
                .map(entity1 -> ProductoResponse.builder()
                        .id(entity1.getIdProducto())
                        .nombre(entity1.getNombre())
                        .precio(entity1.getPrecio())
                .build()).collect(Collectors.toList());
    }
}
