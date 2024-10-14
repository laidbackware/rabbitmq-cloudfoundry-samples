package com.rabbitmq.cftutorial.rabbitmq_spring;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue hello() {
        return new Queue("messages");
    }

}