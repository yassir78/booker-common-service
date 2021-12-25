package com.example.bookercommonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookerCommonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookerCommonServiceApplication.class, args);
    }

}
