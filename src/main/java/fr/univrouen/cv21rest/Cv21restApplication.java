package fr.univrouen.cv21rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cv21restApplication {

	public static void main(String[] args) {
		System.getProperties().put("server.port");

		SpringApplication.run(Cv21restApplication.class, args);
	}

}
