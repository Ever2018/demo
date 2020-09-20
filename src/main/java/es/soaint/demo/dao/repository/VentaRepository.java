package es.soaint.demo.dao.repository;

import es.soaint.demo.model.entity.VentaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<VentaEntity, Integer> {
}
