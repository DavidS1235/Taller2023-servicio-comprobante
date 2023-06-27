package com.taller2023.serviciocomprobante.controller;

import com.taller2023.serviciocomprobante.entity.Comprobante;
import com.taller2023.serviciocomprobante.service.IComprobanteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ComprobanteControllerTest {

    @Mock
    private IComprobanteService service;
    @InjectMocks
    private ComprobanteController controller;
    @Test
    void listarporCodigo() {

        //Arrange
        String code = "CP0009";
        Comprobante c1 = new Comprobante();

        //Act
        Mockito.when(service.findByIdCompr(code))
                .thenReturn(c1);

        Comprobante res = controller.buscarComrpobante(code);

        //Assert
        Mockito.verify(service, Mockito.times(1))
                .findByIdCompr(code);

        Assertions.assertEquals(c1,res);
    }
}