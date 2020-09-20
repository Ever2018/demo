package es.soaint.demo.mapper;

import es.soaint.demo.model.api.request.ClienteRequest;
import es.soaint.demo.model.api.response.ClienteResponse;
import es.soaint.demo.model.dto.ClienteDto;
import es.soaint.demo.model.entity.ClienteEntity;

public interface ClienteMapper {
    ClienteDto clientRequestToDto(ClienteRequest request);
    ClienteEntity clientDtoToEntity(ClienteDto dto);
    ClienteResponse entityToClientResponse(ClienteEntity entity);
}
