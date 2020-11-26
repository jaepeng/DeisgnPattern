package com.jae.factory.absfactory.pizzastore.orderpizza;

import com.jae.factory.absfactory.pizzastore.pizza.Pizza;

//一个抽象工厂模式的抽象层
public interface AbsFacotory {
    //让下面子类来具体实现
    public Pizza createPizza(String orderType);
}
