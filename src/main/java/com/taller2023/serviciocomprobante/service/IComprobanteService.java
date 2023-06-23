package com.taller2023.serviciocomprobante.service;

import com.taller2023.serviciocomprobante.entity.Comprobante;

import java.util.List;

public interface IComprobanteService {
    public List<Comprobante> findAll();

    public Comprobante findByIdCompr(String idComprobante);

    public void createComprobante(Comprobante comprobante);
}
