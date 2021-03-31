package com.huntmoon.servlet;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class Test {
    @PostConstruct
    public void init() {
        log.info("test1");
        MDC.put("pid","1111111111222222");
        log.error("test {} {}","sss","ddd",new Exception("sldkfsd"));
        log.error("test ",new Exception("sldkfsd8888"));
    }
}
