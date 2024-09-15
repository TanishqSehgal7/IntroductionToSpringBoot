package com.springlectures.week1Intro.introductionToSpringBoot.AliceAndBakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ChocolateCakeBaker implements Frosting, Syrup {

    public void bakeChocolateCake() {
        System.out.println("Baking Chocolate Cake with " + getFrostingType() + " and " + getSyrupType());
    }

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
