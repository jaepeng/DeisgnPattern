package com.jae.factory.factorymethod.pizzastore.order;

import com.jae.factory.factorymethod.pizzastore.BJCheesePizza;
import com.jae.factory.factorymethod.pizzastore.BJPepperPizza;
import com.jae.factory.factorymethod.pizzastore.Pizza;

public class BjOrderPizza extends OrderPizz {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
