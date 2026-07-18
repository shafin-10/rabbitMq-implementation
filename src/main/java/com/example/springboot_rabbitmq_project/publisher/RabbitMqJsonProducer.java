package com.example.springboot_rabbitmq_project.publisher;

import com.example.springboot_rabbitmq_project.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqJsonProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routingKey.json.name}")
    private String routingJsonKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMqJsonProducer.class);

    public void sendMessage(User user){
        LOGGER.info(String.format("Json Message send -> %s", user));
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, user);
    }
}
