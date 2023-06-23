package com.taller2023.serviciocomprobante.service;

import com.taller2023.serviciocomprobante.entity.Comprobante;
import com.taller2023.serviciocomprobante.repository.ComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteServiceImpl implements IComprobanteService{

    @Autowired
    ComprobanteRepository repository;
    @Override
    public List<Comprobante> findAll() {
        return repository.findAll();
    }

    @Override
    public Comprobante findByIdCompr(String idComprobante) {
        return repository.findByidComprobante(idComprobante)
                .orElse(null);
    }

    @Override
    public void createComprobante(Comprobante comprobante) {
        repository.save(comprobante);
    }
}
