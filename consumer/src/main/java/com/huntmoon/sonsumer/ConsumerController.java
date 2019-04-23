package com.huntmoon.sonsumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ConsumerController {
    private final ProducerFeignClient feignClient;
    @PostMapping("test")
    public String test(){
        log.info("consumer");
        return feignClient.test();
    }
}

