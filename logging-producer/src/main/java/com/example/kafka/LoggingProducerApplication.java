package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@SpringBootApplication
@EnableBinding(Source.class)
public class LoggingProducerApplication {

public static void main(String[] args) {
    SpringApplication.run(LoggingProducerApplication.class, args);
}

 @InboundChannelAdapter(Source.OUTPUT)
    public String greet() {
        return "hello world " ;
    }
}