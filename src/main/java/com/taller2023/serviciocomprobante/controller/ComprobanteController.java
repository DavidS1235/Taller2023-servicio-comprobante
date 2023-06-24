package com.taller2023.serviciocomprobante.controller;

import com.taller2023.serviciocomprobante.entity.Comprobante;
import com.taller2023.serviciocomprobante.service.IComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComprobanteController {
    @Autowired
    private IComprobanteService service;

    @GetMapping("/listar-comprobantes")
    public List<Comprobante> listar(){
        return service.findAll();
    }

    @GetMapping("/listar-comprobantes/code")
    public Comprobante buscarComrpobante(
            @RequestParam String idComp){
        return service.findByIdCompr(idComp);
    }

    @RequestMapping(value = "/comprobantes/create", method = RequestMethod.POST)
    public void addComprobante(
            @RequestBody Comprobante comprobante) {
        service.createComprobante(comprobante);
    }
}
