package com.example.demo.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@OpenAPIDefinition
@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI baseSwaggerApi() {
		return new OpenAPI().info(new Info().title("Vehicle Tracker API").version("1.0.0").description("A RESTful Spring Boot Application to manage vehicle details for a vehicle organization"));
	}
}
