package org.spring.email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

       String[] emails =  applicationContext.getBean(EmailService.class).sendEmail();

        System.out.println(Arrays.toString(emails));
    }
}
