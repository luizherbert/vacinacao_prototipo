package com.prototipo.vacinacaoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.prototipo.vacinacaoweb.repositories")
public class VacinacaoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacinacaoWebApplication.class, args);
	}
}
