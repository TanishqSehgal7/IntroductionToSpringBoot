package com.springlectures.week1Intro.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "dev.env", havingValue = "production")
public class ProdDb implements DB {

    @Override
    public String getDataFromDb() {
        return "Data from Production Database";
    }
}
