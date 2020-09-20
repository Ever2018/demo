package es.soaint.demo.service;

import es.soaint.demo.model.api.request.ClienteRequest;
import es.soaint.demo.model.api.response.ClienteResponse;

public interface ClienteService {
    ClienteResponse saveClient(ClienteRequest request);
}
