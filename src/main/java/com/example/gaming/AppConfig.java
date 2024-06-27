package com.example.gaming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Game mario() {
        return new Mario();
    }

    @Bean
    public Game pacman() {
        return new Pacman();
    }

    @Bean
    public Game templeRun() {
        return new TempleRun();
    }
}
