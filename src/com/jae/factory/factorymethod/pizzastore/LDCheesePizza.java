package com.jae.factory.factorymethod.pizzastore;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LD奶酪披萨");
        System.out.println("准备LD奶酪披萨");
    }
}
