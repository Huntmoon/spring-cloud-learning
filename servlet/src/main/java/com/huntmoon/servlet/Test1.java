package com.huntmoon.servlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.beans.factory.config.AutowireCapableBeanFactory.AUTOWIRE_BY_NAME;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(C.class);
        annotationConfigApplicationContext.refresh();
        A bean = annotationConfigApplicationContext.getBean(A.class);
        annotationConfigApplicationContext.getAutowireCapableBeanFactory().autowireBeanProperties(bean,AUTOWIRE_BY_NAME,false);
        bean.getB();
    }






}
