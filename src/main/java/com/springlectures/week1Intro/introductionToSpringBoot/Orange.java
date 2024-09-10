package com.springlectures.week1Intro.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Orange {

    void eatOrange() {
        System.out.println("I am eating the Orange");
    }

    @PostConstruct
    void callThisAfterOrangeIsUsed() {
        System.out.println("Creating the orange before use...");
    }

    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("Destroying the Orange bean...");
    }

}
