package com.jae.strategy;

public class WildDuck extends Duck {

    //构造器,传入FlyBehavior
    public WildDuck(){
        fl=new GoodFly();
    }


    @Override
    public void display() {
        System.out.println("这是野鸭");
    }

}
