package com.jae.prototype;

public class Client  {
    public static void main(String[] args) {
        //传统方法
        Sheep sheep=new Sheep("tom",1,    "白色");
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        //...
        System.out.println(sheep);
        //...

    }
}
