package com.springlectures.week1Intro.introductionToSpringBoot.DependencyInjection;

import com.springlectures.week1Intro.introductionToSpringBoot.DependencyInjection.DB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "dev.env", havingValue = "development")
public class DevDb implements DB {

    @Override
    public String getDataFromDb() {
        return "Data from Development Database";
    }
    
}
