package com.springlectures.week1Intro.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class Apple {
    void eatApple() {
        System.out.println("I am eating the apple.");
    }

    @PostConstruct // Bean initialization
    void callThisBeforeAppleIsUsed() {
        System.out.println("Creating the apple before use...");
    }

    @PreDestroy // this method is executed just before the bean is destroyed/ just beore app is terminated
    void callThisBeforeDestroy() {
        System.out.println("Destroying the Apple bean...");
    }

}