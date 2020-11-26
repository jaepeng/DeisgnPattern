package com.jae.factory.absfactory.pizzastore.orderpizza;

import com.jae.factory.absfactory.pizzastore.pizza.Pizza;
import com.jae.factory.factorymethod.pizzastore.order.OrderPizz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFacotory facotory;
    //构造器
    public OrderPizza(AbsFacotory absFacotory){
        setFacotory(absFacotory);
    }

    private void setFacotory(AbsFacotory facotory) {
        Pizza pizza=null;
        String orderType="";
        this.facotory=facotory;

        do {
            orderType=getType();
            //factory 可能是北京的工厂子类，也可能是伦敦的
            pizza=facotory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("false order");
                break;

            }
        }while (true);

    }

    private String getType() {
        try{
            BufferedReader reader=
                    new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入pizza种类：");
            String type=reader.readLine();
            return type;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }

}
