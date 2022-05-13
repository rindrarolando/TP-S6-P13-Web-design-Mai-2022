package com.miniprojet.rechauffementclimatique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@EnableAutoConfiguration
@SpringBootApplication
public class RechauffementClimatiqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(RechauffementClimatiqueApplication.class, args);
	}

}
