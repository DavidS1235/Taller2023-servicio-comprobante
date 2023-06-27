package com.taller2023.serviciocomprobante.entity;

import lombok.Data;

import javax.persistence.*;
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
