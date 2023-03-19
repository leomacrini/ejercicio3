package com.example.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

public static void main(String[] args){
		ApplicationContext context =  SpringApplication.run(Ejercicio3Application.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println(repository.findAll());
		System.out.println(repository.count());

		Coche corolla = new Coche(null, "toyota", "general motors", "nafta");

		repository.save(corolla);
	System.out.println("El numero de coches es : "+ repository.count());

	System.out.println(repository.findAll());
}
}
