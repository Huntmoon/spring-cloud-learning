package com.huntmoon.amqp;

import org.springframework.cloud.bus.SpringCloudBusClient;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author wangtao
 * @since 2018/1/3
 */
public interface Sink {
    String INPUT = "wtInput";

    @Input(Sink.INPUT)
    SubscribableChannel input();

    @Output("wtOutput")
    MessageChannel springCloudBusOutput();
}
