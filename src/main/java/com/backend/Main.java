package com.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.backend.model.entity")
public class Main {
    public static void main(String[] args) {
        System.out.println("Spring se está ejecutando...");
        SpringApplication.run(Main.class, args);
    }
}
