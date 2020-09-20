package es.soaint.demo.dao.repository;

import es.soaint.demo.model.entity.DetalleVentaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends CrudRepository<DetalleVentaEntity, Integer> {
}
