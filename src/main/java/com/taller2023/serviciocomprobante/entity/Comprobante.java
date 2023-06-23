package com.taller2023.serviciocomprobante.entity;

import lombok.Data;

import javax.persistence.*;

/*  `idComprobante` varchar(6) NOT NULL,
          `idCliente` varchar(11) NOT NULL,
          `codVendedor` varchar(6) NOT NULL,
          `tipoComp` int(1) NOT NULL,
          `fechaComp` datetime NOT NULL,
          `subtotal` float NOT NULL,
          `igv` float NOT NULL,
          `total` float NOT NULL*/
@Entity
@Table(name = "comprobante")
@Data
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private String idComprobante;
    private String idCliente;
    private String codVendedor;
    private Integer tipoComp;
    private String fechaComp;
    private Double subtotal;
    private Double igv;
    private Double total;
}
