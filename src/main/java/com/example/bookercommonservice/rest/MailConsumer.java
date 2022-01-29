package com.example.bookercommonservice.rest;

import com.example.bookercommonservice.config.MessageKafka;
import com.example.bookercommonservice.dto.CustomerOrderDto;
import com.example.bookercommonservice.proxy.UserProxy;
import com.example.bookercommonservice.serviceImpl.SendMailService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MailConsumer {
    private final SendMailService mailService;
    private final UserProxy userProxy;
    private final Gson jsonConverter;

    @KafkaListener(topics = "${kafka.order-topic}", groupId = "groupId")
    public void sendMailConsumer(String message) {
        MessageKafka msg = jsonConverter.fromJson(message, MessageKafka.class);
        CustomerOrderDto orderDto = jsonConverter.fromJson(msg.getPayload(), CustomerOrderDto.class);
        String email = userProxy.findEmailByRef(orderDto.getBuyerRef());
        mailService.sendMail("We’re on it",
                email, "Thank you for your purchase. Here’s the confirmation of your order.\n" +
                        "Your package is on its way!");
    }
}
