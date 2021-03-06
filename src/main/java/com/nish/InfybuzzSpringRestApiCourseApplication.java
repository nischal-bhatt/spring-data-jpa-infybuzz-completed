package com.nish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.controller","com.service","com.aop"})
@EntityScan("com.entity")
@EnableJpaRepositories("com.repository")
public class InfybuzzSpringRestApiCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfybuzzSpringRestApiCourseApplication.class, args);
	}

}
