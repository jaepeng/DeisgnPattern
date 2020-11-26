package com.jae.strategy;

public class GoodFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞的和好");
    }
}
