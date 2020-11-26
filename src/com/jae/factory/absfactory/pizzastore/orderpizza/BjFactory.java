package com.jae.factory.absfactory.pizzastore.orderpizza;

import com.jae.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.jae.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.jae.factory.absfactory.pizzastore.pizza.Pizza;

public class BjFactory implements AbsFacotory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza =null;
        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new BJPepperPizza();

        }else {
            return null;
        }
        return pizza;
    }
}
