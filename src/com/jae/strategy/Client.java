package com.jae.strategy;

public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        ToyDuck toyDuck=new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        toyDuck.setNewFlyBehavior(new GoodFly());
        System.out.println("===改变状态===");
        toyDuck.display();
        toyDuck.fly();
    }
}
