package com.huntmoon.swagger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther huntmoon
 * @since 2017/12/5.
 */
@RestController
public class TestController {
    @PostMapping("test")
    public void test(@RequestBody Test test) {

    }
}
