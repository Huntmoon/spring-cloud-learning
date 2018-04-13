package com.huntmoon.spring.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitListenserTest {
    @RabbitListener(queues = "test")
    public void test(String test){
        System.out.println(test);
    }
}
