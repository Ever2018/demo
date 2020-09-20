package es.soaint.demo.service;

import es.soaint.demo.model.api.request.VentaRequest;
import es.soaint.demo.model.api.response.VentaResponse;
import es.soaint.demo.model.entity.VentaEntity;

import java.util.List;

public interface VentaService {

    VentaResponse saveSale(VentaRequest request);

    List<VentaEntity> listSales();
}
