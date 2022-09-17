package com.gestion.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class GestionPortfolioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionPortfolioBackendApplication.class, args);
	}



	//Configurar CORS
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200"/*para permitir el acceso de varios sitios desbloquear, no es seguro subir a internet*/).allowedMethods("*").allowedHeaders("*");
			}
		};
	}
	

}
