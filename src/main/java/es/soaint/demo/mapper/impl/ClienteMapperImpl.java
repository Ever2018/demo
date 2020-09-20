package es.soaint.demo.mapper.impl;

import es.soaint.demo.mapper.ClienteMapper;
import es.soaint.demo.model.api.request.ClienteRequest;
import es.soaint.demo.model.api.response.ClienteResponse;
import es.soaint.demo.model.dto.ClienteDto;
import es.soaint.demo.model.entity.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDto clientRequestToDto(ClienteRequest request) {
        return ClienteDto.builder()
                .nombre(request.getNombre())
                .apellido(request.getApellido())
                .dni(request.getDni())
                .email(request.getEmail())
                .telefono(request.getTelefono())
                .build();
    }

    @Override
    public ClienteEntity clientDtoToEntity(ClienteDto dto) {
        return ClienteEntity.builder()
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .dni(dto.getDni())
                .email(dto.getEmail())
                .telefono(dto.getTelefono())
                .build();
    }

    @Override
    public ClienteResponse entityToClientResponse(ClienteEntity entity) {
        return ClienteResponse.builder()
                .nombre(entity.getNombre())
                .apellido(entity.getApellido())
                .dni(entity.getDni())
                .email(entity.getEmail())
                .telefono(entity.getTelefono())
                .build();
    }

}
