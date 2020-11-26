package com.jae.factory.absfactory.pizzastore.orderpizza;

import com.jae.factory.absfactory.pizzastore.pizza.*;

public class LdFactory implements AbsFacotory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza =null;
        if (orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new LDPepperPizza();

        }else {
            return null;
        }
        return pizza;
    }
}
