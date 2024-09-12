package com.springlectures.week1Intro.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    Apple getApple() { // this is a factory method that provides the Apple bean
        return new Apple();
    }

    @Bean
    @Scope("prototype") // scopes a single bean definition to any number of instances
    Orange getOrange() {
        return new Orange();
    }
}
