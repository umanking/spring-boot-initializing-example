package com.example.springbootinitializingexample;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class SpringBootInitializingExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInitializingExampleApplication.class, args);
    }

    @Bean
//    @Order(value = 1) // 적용안됨
    public CommandLineRunner commandLineRunner() {
        return args -> System.out.println("hello commandLineRunner");
    }

    @Bean
//    @Order(value = 1000) //적용안됨
    public ApplicationRunner applicationRunner() {
        return args -> System.out.println("hello applicationRunners");
    }

}
