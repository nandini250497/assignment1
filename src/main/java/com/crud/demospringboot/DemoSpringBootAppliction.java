package com.crud.demospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootApplication {


    @Autowired
    private CustomerRepository custRepo;


    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootApplication.class, args);
    }
    @Bean
    public CommandLineRunner insertRecords(){
        return (args) -> {
            custRepo.save(new Customer("nandini","karlapudi"));
            custRepo.save(new Customer("nandu","karlapudi"));

        };
    }

}
