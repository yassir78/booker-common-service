package com.example.bookercommonservice.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;
    @Value(value = "${kafka.order-topic}")
    private String orderTopic;
    @Value(value = "${kafka.pay-order-topic}")
    private String payOrderTopic;
    @Value(value = "${kafka.update-order-topic}")
    private String updateOrderTopic;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic topic1() {
        return new NewTopic(orderTopic, 1, (short) 1);
    }



    @Bean
    public NewTopic topic2() {
        return new NewTopic(payOrderTopic, 1, (short) 1);
    }

    @Bean
    public NewTopic topic3() {
        return new NewTopic(updateOrderTopic, 1, (short) 1);
    }
}
