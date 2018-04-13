package com.huntmoon.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author wangtao
 * @since 2018/1/3
 */
@SpringBootApplication
//@EnableBinding(Sink.class)
@EnableRabbit
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @StreamListener(Sink.INPUT)
    public void process(String string) {
        System.out.println(string);
    }

    @RabbitListener(queues = "test")
    public void p(String test) {
        System.out.println(test);
    }
}
