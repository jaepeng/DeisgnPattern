package com.jae.factory.factorymethod.pizzastore;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京pepper披萨");
        System.out.println("准备北京pepper披萨");
    }
}
