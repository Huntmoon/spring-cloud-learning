package coml.huntmoon.spring.cloud.learning.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class ProducerController {
    @PostMapping("test")
    public String test(HttpServletRequest request){
        log.info("test zipkin");
        return "test";
    }
}
