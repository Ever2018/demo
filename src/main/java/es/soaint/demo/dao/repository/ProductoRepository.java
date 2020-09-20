package es.soaint.demo.dao.repository;

import es.soaint.demo.model.entity.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Integer> {
}
