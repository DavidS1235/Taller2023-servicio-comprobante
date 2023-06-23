package com.taller2023.serviciocomprobante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@ComponentScan
public class ServicioComprobanteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioComprobanteApplication.class, args);
	}

}
