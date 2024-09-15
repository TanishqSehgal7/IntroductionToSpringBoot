package com.springlectures.week1Intro.introductionToSpringBoot.AliceAndBakery;

import org.springframework.stereotype.Service;

@Service
public class CakeBakerService {

    private ChocolateCakeBaker ccb;
    private StrawberryCakeBaker scb;

    public CakeBakerService(ChocolateCakeBaker ccb, StrawberryCakeBaker scb) {
        this.ccb = ccb;
        this.scb = scb;
    }

    public void bakeChocolateCake() {
        ccb.bakeChocolateCake();
    }

    public void bakeStrawberryCake() {
        scb.bakeStrawberryCake();
    }
}
