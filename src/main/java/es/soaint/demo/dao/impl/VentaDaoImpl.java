package es.soaint.demo.dao.impl;

import es.soaint.demo.dao.VentaDao;
import es.soaint.demo.dao.repository.DetalleVentaRepository;
import es.soaint.demo.dao.repository.VentaRepository;
import es.soaint.demo.mapper.VentaMapper;
import es.soaint.demo.model.api.response.VentaResponse;
import es.soaint.demo.model.dto.VentaDto;
import es.soaint.demo.model.entity.DetalleVentaEntity;
import es.soaint.demo.model.entity.VentaEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@AllArgsConstructor
public class VentaDaoImpl implements VentaDao {

    private VentaRepository repository;

    private DetalleVentaRepository detalleVentaRepository;

    private VentaMapper mapper;

    @Override
    @Transactional
    public VentaResponse saveSale(VentaDto dto) {
         VentaEntity ventaEntity = repository.save(mapper.dtoToVentaEntity(dto));
         DetalleVentaEntity detalleVentaEntity = detalleVentaRepository.save(mapper.ventaToDetalle(ventaEntity, dto));
         return mapper.entitiesToResponse(ventaEntity, detalleVentaEntity);
    }

    @Override
    public List<VentaEntity> listSales() {
        return (List<VentaEntity>) repository.findAll();
    }


}
