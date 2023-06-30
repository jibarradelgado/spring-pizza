package com.jibarrad.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JibarradPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JibarradPizzeriaApplication.class, args);
	}

}
