package com.example.bookercommonservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.bookercommonservice.bean.NotificationEmail;
import com.example.bookercommonservice.serviceImpl.SendMailService;

@SpringBootApplication
@EnableJpaAuditing
public class BookerCommonServiceApplication implements CommandLineRunner {

	
	@Autowired
    private  SendMailService mailService;
	
    public static void main(String[] args) {
        SpringApplication.run(BookerCommonServiceApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		   
		  //Send account creation notification email
		      mailService.sendMail(new NotificationEmail("Please Activate your Account",
					"belkoweb9718@gmail.com", "Thank you for signing up to Spring Dayliv, " +
		            "please click on the below url to activate your account : " +
		            "http://localhost:8080/api/auth/accountVerification/"+"token"));
		
	}
    
 

}
