package com.jae.bulider.improve.mytest;

public class CandyDirector {
    CandyBuilder candyBuilder=null;


    public CandyDirector(CandyBuilder candyBuilder) {
        this.candyBuilder = candyBuilder;
    }

    public void setCandyBuilder(CandyBuilder candyBuilder) {
        this.candyBuilder = candyBuilder;
    }
    public Candy constructCandy(){
        candyBuilder.addSuger();
        candyBuilder.bake();
        candyBuilder.addPack();
        return candyBuilder.getCandy();
    }
}
