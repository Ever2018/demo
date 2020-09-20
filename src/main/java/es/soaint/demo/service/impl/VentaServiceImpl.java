package es.soaint.demo.service.impl;

import es.soaint.demo.dao.VentaDao;
import es.soaint.demo.mapper.VentaMapper;
import es.soaint.demo.model.api.request.VentaRequest;
import es.soaint.demo.model.api.response.VentaResponse;
import es.soaint.demo.model.entity.VentaEntity;
import es.soaint.demo.service.VentaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VentaServiceImpl implements VentaService {

    private VentaDao dao;

    private VentaMapper mapper;

    @Override
    public VentaResponse saveSale(VentaRequest request) {
        return dao.saveSale(mapper.requestToVentaDto(request));
    }

    @Override
    public List<VentaEntity> listSales() {
        return dao.listSales();
    }
}
