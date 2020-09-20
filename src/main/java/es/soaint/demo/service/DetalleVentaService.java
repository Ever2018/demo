package es.soaint.demo.service;

import es.soaint.demo.model.api.response.DetalleVentaResponse;
import io.reactivex.Observable;
import io.reactivex.Single;

public interface DetalleVentaService {

    Single<DetalleVentaResponse> findDetailByIdVenta(Integer id) throws Exception;
}
