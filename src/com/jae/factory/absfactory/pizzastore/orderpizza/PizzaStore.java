package com.jae.factory.absfactory.pizzastore.orderpizza;


public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BjFactory());
    }
}
