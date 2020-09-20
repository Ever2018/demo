package es.soaint.demo.dao;

import es.soaint.demo.model.api.response.DetalleVentaResponse;
import io.reactivex.Single;

public interface DetalleVentaDao {

    Single<DetalleVentaResponse> findDetailByIdVenta(Integer id) throws Exception;
}
