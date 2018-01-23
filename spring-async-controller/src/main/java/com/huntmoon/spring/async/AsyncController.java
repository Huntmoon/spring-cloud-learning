package com.huntmoon.spring.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureTask;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wangtao
 * @since 2018/1/10
 */
@RestController
@Slf4j
public class AsyncController {

    @InitBinder
    public void binder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Person.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                setValue(JSon);
            }
        });
    }

    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    @RequestMapping("test")
    public Callable<Person> person() {
        log.info("tomcat工作线程");
        return new Callable<Person>() {
            @Override
            public Person call() throws Exception {
                log.info("异步线程");
                return new Person("li", "lei");
            }
        };
    }

    @RequestMapping("futureTask")
    public ListenableFuture<Person> listenableFuture() {
        log.info("tomcat工作线程");
        ListenableFutureTask<Person> personListenableFutureTask = new ListenableFutureTask<>(new Callable<Person>() {
            @Override
            public Person call() throws Exception {
                log.info("异步线程");
                return new Person("li", "lei");
            }
        });
        executorService.submit(personListenableFutureTask);
        return personListenableFutureTask;
    }


    @RequestMapping("deferredResult")
    public DeferredResult<Person> deferredResult() {
        log.info("tomcat工作线程");
        new DeferredResult<>();
        ListenableFutureTask<Person> personListenableFutureTask = new ListenableFutureTask<>(new Callable<Person>() {
            @Override
            public Person call() throws Exception {
                log.info("异步线程");
                return new Person("li", "lei");
            }
        });
        executorService.submit(personListenableFutureTask);
        return new DeferredResult<>();
    }

    @RequestMapping(value = "gateway",params = {"method=1","method=2"})
    public void method(@RequestParam String method) {
        log.info("method={}", method);
    }

    @RequestMapping(value = "gateway")
    public void method2(@RequestParam String method) {

        log.info("methodtest={}", method);
    }
}
