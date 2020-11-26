package com.jae.decorator;

public class CoffeBar {
    public static void main(String[] args) {
        //装饰着模式下订单
        //1.点一份longblack
        Drink order=new LongBlack();
        System.out.println("费用："+order.cost());
        System.out.println("描述信息="+order.getDes());


        //加入一份牛奶
        order=new Milk(order);
        System.out.println("加入一份牛奶费用："+order.cost());
        System.out.println("加入一份牛奶描述信息="+order.getDes());
        //再加入一份巧克力
        order=new Chocolate(order);

        System.out.println("加入一份牛奶，再加入一份巧克力，费用："+order.cost());
        System.out.println("加入一份牛奶，再加入一份巧克力，描述信息="+order.getDes());
    }
}
