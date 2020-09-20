package es.soaint.demo.dao.impl;

import es.soaint.demo.dao.DetalleVentaDao;
import es.soaint.demo.dao.repository.DetalleVentaRepository;
import es.soaint.demo.mapper.DetalleVentaMapper;
import es.soaint.demo.model.api.response.DetalleVentaResponse;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@AllArgsConstructor
public class DetalleVentaDaoImpl implements DetalleVentaDao {

    private DetalleVentaRepository repository;

    private DetalleVentaMapper mapper;

    @Override
    public Single<DetalleVentaResponse> findDetailByIdVenta(Integer id) throws Exception {
        return Single.just(Objects.requireNonNull(repository.findById(id).orElse(null)))
                .map(detalleVentaEntity -> mapper.entityToResponse(detalleVentaEntity));
    }

}
