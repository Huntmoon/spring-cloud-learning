package com.huntmoon.spring.rabbit;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SpringRabbitApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitApp.class, args);
    }
}
