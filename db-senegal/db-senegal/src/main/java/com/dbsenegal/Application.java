package com.dbsenegal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaAuditing
@EnableJpaRepositories
@SpringBootApplication(scanBasePackages= {"com.dbsenegal.common","com.dbsenegal.controller","com.dbsenegal.entities","com.dbsenegal.repositories","com.dbsenegal.services"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}


}
