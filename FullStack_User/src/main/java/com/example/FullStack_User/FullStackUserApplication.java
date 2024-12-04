package com.example.FullStack_User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.controller", "com.service" })
@EntityScan("com.entity")
@EnableJpaRepositories("com.repo")
@Configuration
@SpringBootApplication
public class FullStackUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackUserApplication.class, args);
	}

}
