package com.example.springboot_rabbitmq_project.controller;

import com.example.springboot_rabbitmq_project.dto.User;
import com.example.springboot_rabbitmq_project.publisher.RabbitMqJsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {

    @Autowired
    private RabbitMqJsonProducer rabbitMqJsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        rabbitMqJsonProducer.sendMessage(user);
        return ResponseEntity.ok("json message sent to rabbit mq");
    }
}
