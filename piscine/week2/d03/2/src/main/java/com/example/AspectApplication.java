package com.example;

import com.example.context.AspectApplicationConfiguration;
import com.example.timer.Timer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectApplicationConfiguration.class);

        Timer timer = context.getBean("timer", Timer.class);

        timer.waitSeconds(3);
    }
}
