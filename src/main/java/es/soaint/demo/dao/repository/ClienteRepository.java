package es.soaint.demo.dao.repository;

import es.soaint.demo.model.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, Integer> {
}
