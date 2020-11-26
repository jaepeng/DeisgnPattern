package com.jae.factory.simplefactory.pizzastore.pizza.order;

import com.jae.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.jae.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.jae.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.jae.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizz{
    //构造器
//    public OrderPizz(){
//        Pizza pizza =null;
//        String orderType;
//        do {
//            orderType=getType();
//            if (orderType.equals("greek")){
//                pizza=new GreekPizza();
//            }else if(orderType.equals("cheese")){
//                pizza=new CheesePizza();
//            }else if (orderType.equals("pepper")){
//                pizza=new PepperPizza();
//            }else{
//                break;
//            }
//            pizza.setName(orderType);
//            //输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    //构造器
    public OrderPizz(SimpleFactory simpleFactory){
        setFactory(simpleFactory);

    }


    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza=null;
    public void setFactory(SimpleFactory simpleFactory){
        String ordertype="";//用户输入的
        this.simpleFactory=simpleFactory;
        do {
            ordertype =getType();
            //
            pizza=this.simpleFactory.createPizza(ordertype);
            //输出pizza
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
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
