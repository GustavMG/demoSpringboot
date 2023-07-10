package com.hotelGeneration.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hola Generation");
		System.out.println("Se debe apagar el servidor y luego correr el programa para ver los ultimos cambios");
	}

}
