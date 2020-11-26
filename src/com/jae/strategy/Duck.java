package com.jae.strategy;

public abstract class Duck {
    FlyBehavior fl;
    CryBeahivor cry;
    public void cry(CryBeahivor cry){
        cry.call();
    }
    public abstract void display();
    public void swim(){
        System.out.println("鸭子游泳");
    }
    public void fly(){
        if (fl!=null){
            fl.fly();
        }
    }
}
