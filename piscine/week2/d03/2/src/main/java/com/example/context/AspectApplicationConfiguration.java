package com.example.context;

import com.example.timer.Timer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.example.annotation","com.example.aspect","com.example.timer"})
public class AspectApplicationConfiguration {
    @Bean
    public Timer timer() {
        return new Timer();
    }
}