package com.jae.factory.simplefactory.pizzastore.pizza.order;

import com.jae.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.jae.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.jae.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.jae.factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    //根据ordertype返回对应的pizza对象
    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza=new GreekPizza();
        }else if(orderType.equals("cheese")){
            pizza=new CheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new PepperPizza();
        }
        return pizza;
    }
}
