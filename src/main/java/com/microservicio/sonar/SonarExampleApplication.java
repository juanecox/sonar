package com.microservicio.sonar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarExampleApplication {
	private static final Logger log = LoggerFactory.getLogger(SonarExampleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SonarExampleApplication.class, args);
		log.info("Hola Mundo");
	}

}
