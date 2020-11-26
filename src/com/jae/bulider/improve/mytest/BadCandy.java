package com.jae.bulider.improve.mytest;

public class BadCandy extends CandyBuilder {
    @Override
    public void addSuger() {
        System.out.println("给不好吃的糖加糖");
    }

    @Override
    public void addPack() {
        System.out.println("给不好吃的糖包装");
    }

    @Override
    public void bake() {
        System.out.println("给不好吃的糖烘焙");
    }
}
