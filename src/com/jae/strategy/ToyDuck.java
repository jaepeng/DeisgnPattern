package com.jae.strategy;

public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }
    public ToyDuck(){
        fl=new NoFly();
    }
    public void setNewFlyBehavior(FlyBehavior flyBehavior){
        fl=flyBehavior;
    }

}
