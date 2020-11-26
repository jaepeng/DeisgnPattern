package com.jae.factory.factorymethod.pizzastore.order;

import com.jae.factory.factorymethod.pizzastore.Pizza;
import com.jae.factory.simplefactory.pizzastore.pizza.order.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  abstract class OrderPizz {


    //定义一个抽象方法，createPizza,让各个工厂子类自己实现
    abstract  Pizza createPizza(String orderType);

    //构造器
    public OrderPizz(){
        Pizza pizza =null;
        String orderType="";
        do {
            orderType=getType();
            pizza=createPizza(orderType);//抽象的，由工厂子类完成
            //输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }
    //写一个方法，获取用户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
