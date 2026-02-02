package com.example.consumerApplication;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

public class Consumer {
    @KafkaListener(topics ="mt-topic",groupId = "sample")
    public void getMessage(String message){
        System.out.println(message);
    }
}
