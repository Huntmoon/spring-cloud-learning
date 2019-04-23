package com.huntmoon.sonsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("producer")
public interface ProducerFeignClient {
    @PostMapping("test")
    public String test();
}
