package es.soaint.demo.controller;

import es.soaint.demo.model.api.request.ClienteRequest;
import es.soaint.demo.model.api.response.ClienteResponse;
import es.soaint.demo.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("/soaint/client")
public class ClienteController {

    private ClienteService service;

    @PostMapping(value = "/save", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ClienteResponse saveClient(@Valid @RequestBody ClienteRequest request) {
        return service.saveClient(request);
    }

}
