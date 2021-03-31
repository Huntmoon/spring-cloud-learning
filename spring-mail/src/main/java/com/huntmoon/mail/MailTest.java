package com.huntmoon.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import javax.mail.SendFailedException;

@SpringBootApplication
public class MailTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MailTest.class);
        MailSender bean = run.getBean(MailSender.class);
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("noreply@ndmicro.com");
        simpleMailMessage.setText("test");
        simpleMailMessage.setTo(new String[]{"tao.wang1111@atomefin.com.cn","tao.wang@atomefin.com.cn"});
        try {
            bean.send(simpleMailMessage);
        } catch (MailSendException e) {
            Exception cause = e.getMessageExceptions()[0];
            if (cause instanceof SendFailedException) {
                System.out.println(((SendFailedException) cause).getInvalidAddresses()[0]);
            }
            e.printStackTrace();
        }
    }
}
