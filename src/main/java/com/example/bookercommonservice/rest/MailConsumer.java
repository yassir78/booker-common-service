package com.example.bookercommonservice.rest;

import com.example.bookercommonservice.bean.NotificationEmail;
import com.example.bookercommonservice.dto.CustomerOrderDto;
import com.example.bookercommonservice.serviceImpl.SendMailService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MailConsumer {
    private final SendMailService mailService;

    @KafkaListener(topics ="${kafka.topic.order-topic}", groupId = "groupId")
    public void sendMailConsumer(CustomerOrderDto customerOrderDto) {
        mailService.sendMail(new NotificationEmail("Please Activate your Account",
                "belkoweb9718@gmail.com", "Thank you for signing up to Spring Dayliv, " +
                "please click on the below url to activate your account : " +
                "http://localhost:8080/api/auth/accountVerification/"+"token"));
    }
}
