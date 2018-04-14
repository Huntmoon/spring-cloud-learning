package com.huntmoon.spring.cloud.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author wangtao
 * @since 2018/4/14
 */
@EnableBinding(StreamExample.StreamClient.class)
public class StreamExample {
    @StreamListener("huntmoonIN")
    public void test(String test) {
        System.out.println(test);
    }

    public static interface StreamClient{
        @Input("huntmoonIN")
        SubscribableChannel input();

        @Output("huntmoonOUT")
        MessageChannel springCloudBusOutput();
    }
}
