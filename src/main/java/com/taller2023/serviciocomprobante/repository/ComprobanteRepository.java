package com.taller2023.serviciocomprobante.repository;

import com.taller2023.serviciocomprobante.entity.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ComprobanteRepository extends JpaRepository<Comprobante, Long> {


    Optional<Comprobante> findByidComprobante(String idComprobante);

}
