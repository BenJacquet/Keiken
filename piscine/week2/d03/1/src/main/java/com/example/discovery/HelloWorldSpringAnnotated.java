package com.example.discovery;

import com.example.discovery.renderers.MessageRenderer;
import org.springframework.context.ApplicationContext;
import com.example.discovery.context.HelloWorldConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (HelloWorldConfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}