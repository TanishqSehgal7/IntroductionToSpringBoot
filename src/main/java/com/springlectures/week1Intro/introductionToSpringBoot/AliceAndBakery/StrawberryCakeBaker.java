package com.springlectures.week1Intro.introductionToSpringBoot.AliceAndBakery;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class StrawberryCakeBaker implements Frosting, Syrup {


    public void bakeStrawberryCake() {
        System.out.println("Baking Strawberry Cake with " + getFrostingType() + " and " + getSyrupType());
    }

    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }

    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }

}