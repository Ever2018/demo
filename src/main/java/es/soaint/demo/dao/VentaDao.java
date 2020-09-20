package es.soaint.demo.dao;

import es.soaint.demo.model.api.response.VentaResponse;
import es.soaint.demo.model.dto.VentaDto;
import es.soaint.demo.model.entity.VentaEntity;

import java.util.List;

public interface VentaDao {
    VentaResponse saveSale(VentaDto dto);
    List<VentaEntity> listSales();
}
