package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoForSpringBootConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForSpringBootConfigurationApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ValueConfiguration valueConfiguration) {
		return args -> {
			System.out.println(valueConfiguration.toString());
		};
	}

	@Bean
	CommandLineRunner config(PropertiesConfiguration configuration) {
	    return args -> {
            System.out.println(configuration);
        };
    }
}
