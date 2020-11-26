package com.jae.factory.factorymethod.pizzastore;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDpepper披萨");
        System.out.println("准备LDpepper披萨");
    }
}
