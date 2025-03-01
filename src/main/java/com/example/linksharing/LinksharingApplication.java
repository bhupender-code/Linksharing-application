package com.example.linksharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LinksharingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinksharingApplication.class, args);
	}

}
