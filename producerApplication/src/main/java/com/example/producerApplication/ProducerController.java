package com.example.producerApplication;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {
    private final KafkaTemplate<String,String> kafkaTemplate;
    @PostMapping("/send/{message}")
    public String sendMessage(@PathVariable String message){
        kafkaTemplate.send("mt-topic",message);
        return "message sent successfully";
    }
}
