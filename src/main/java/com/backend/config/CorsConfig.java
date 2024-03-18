package com.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permitir todas las URL
                .allowedOrigins("*") // Permitir desde cualquier origen
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permitir todos los métodos HTTP
                .allowedHeaders("*"); // Permitir todos los encabezados
    }
}