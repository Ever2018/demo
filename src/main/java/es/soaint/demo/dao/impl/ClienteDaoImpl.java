package es.soaint.demo.dao.impl;

import es.soaint.demo.dao.ClienteDao;
import es.soaint.demo.dao.repository.ClienteRepository;
import es.soaint.demo.mapper.ClienteMapper;
import es.soaint.demo.model.api.response.ClienteResponse;
import es.soaint.demo.model.dto.ClienteDto;
import es.soaint.demo.model.entity.ClienteEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ClienteDaoImpl implements ClienteDao {

    private ClienteRepository repository;

    private ClienteMapper mapper;

    @Override
    public ClienteResponse saveClient(ClienteDto dto) {
        ClienteEntity clienteEntity = repository.save(mapper.clientDtoToEntity(dto));
        return mapper.entityToClientResponse(clienteEntity);
    }
}
