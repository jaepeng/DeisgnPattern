package com.jae.decorator;
//具体的decorate ，调味品
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(1.0f);
    }
}
