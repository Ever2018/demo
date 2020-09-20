package es.soaint.demo.dao;

import es.soaint.demo.model.api.response.ClienteResponse;
import es.soaint.demo.model.dto.ClienteDto;

public interface ClienteDao {
    ClienteResponse saveClient(ClienteDto request);
}
