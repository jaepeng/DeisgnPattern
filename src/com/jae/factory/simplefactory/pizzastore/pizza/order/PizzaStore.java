package com.jae.factory.simplefactory.pizzastore.pizza.order;
//相当于一个客户端，完成订购
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizz();
        //使用简单工厂模式
        new OrderPizz(new SimpleFactory());
        System.out.println("退出程序");
    }
}
