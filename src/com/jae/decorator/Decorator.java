package com.jae.decorator;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {//组合关系
        this.drink = drink;
    }
    

    @Override
    public float cost() {
        //getprice 自己价格
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDes() {
        //drink 被装饰者的信息
        return super.des+" "+ super.getPrice()+ " "+drink.getDes();
    }
}
