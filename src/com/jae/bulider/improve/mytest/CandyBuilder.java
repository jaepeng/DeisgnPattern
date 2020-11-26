package com.jae.bulider.improve.mytest;

public abstract class CandyBuilder {
    private Candy candy=null;
    public abstract void addSuger();
    public abstract void addPack();
    public abstract void bake();

    public Candy getCandy(){
        return candy;
    }

}
