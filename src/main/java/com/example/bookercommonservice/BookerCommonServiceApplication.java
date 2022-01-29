package com.example.bookercommonservice;

import com.example.bookercommonservice.serviceImpl.SendMailService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableFeignClients
@EnableEurekaClient
public class BookerCommonServiceApplication implements CommandLineRunner {


    @Autowired
    private SendMailService mailService;

    public static void main(String[] args) {
        SpringApplication.run(BookerCommonServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //Send account creation notification email
       /* mailService.sendMail("Please Activate your Account",
                "yassir.acaf@gmail.com", "Thank you for signing up to Spring Dayliv, " +
                        "please click on the below url to activate your account : " +
                        "http://localhost:8080/api/auth/accountVerification/" + "token");*/

    }

    @Bean
    public Gson jsonConverter() {
        return new Gson();
    }

}
