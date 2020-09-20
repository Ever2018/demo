package es.soaint.demo.dao.impl;

import es.soaint.demo.dao.DetalleVentaDao;
import es.soaint.demo.dao.repository.DetalleVentaRepository;
import es.soaint.demo.dao.repository.VentaRepository;
import es.soaint.demo.mapper.DetalleVentaMapper;
import es.soaint.demo.model.api.response.DetalleVentaResponse;
import es.soaint.demo.model.entity.VentaEntity;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;

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
