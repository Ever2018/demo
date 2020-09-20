package es.soaint.demo.service.impl;

import es.soaint.demo.dao.ClienteDao;
import es.soaint.demo.mapper.ClienteMapper;
import es.soaint.demo.model.api.request.ClienteRequest;
import es.soaint.demo.model.api.response.ClienteResponse;
import es.soaint.demo.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private ClienteDao clienteDao;

    private ClienteMapper mapper;

    @Override
    public ClienteResponse saveClient(ClienteRequest request) {
        return clienteDao.saveClient(mapper.clientRequestToDto(request));
    }

}
