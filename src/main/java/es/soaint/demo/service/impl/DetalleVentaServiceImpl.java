package es.soaint.demo.service.impl;

import es.soaint.demo.dao.DetalleVentaDao;
import es.soaint.demo.model.api.response.DetalleVentaResponse;
import es.soaint.demo.service.DetalleVentaService;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DetalleVentaServiceImpl implements DetalleVentaService {

    private DetalleVentaDao detalleVentaDao;

    public Single<DetalleVentaResponse> findDetailByIdVenta(Integer id) throws Exception {
        return detalleVentaDao.findDetailByIdVenta(id);
    }
}
