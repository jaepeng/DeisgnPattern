package com.jae.decorator;
//具体的decorate ，调味品
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(2.0f);
    }
}
