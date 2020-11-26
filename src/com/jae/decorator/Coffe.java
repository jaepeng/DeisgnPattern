package com.jae.decorator;

public class Coffe extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
