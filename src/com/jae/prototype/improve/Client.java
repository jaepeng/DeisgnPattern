package com.jae.prototype.improve;
import com.jae.prototype.improve.Sheep;

public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式实现对象克隆");
        Sheep sheep=new Sheep("tom",1,    "白色");


        sheep.friend=new Sheep("jack",2,"黑色");
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();
        Sheep sheep6 = (Sheep)sheep.clone();
        //打印结果是一样的，说明克隆出来的对象，里面的对象属性只是指向了原型的对象属性的值，而不是也拷贝一份原型的对象属性
        //即：浅拷贝
        System.out.println(sheep2+"sheep2.frined="+sheep2.friend.hashCode());
        sheep2.friend=new Sheep("mixi",3,"灰色");
        System.out.println(sheep3+"sheep3.frined="+sheep3.friend.hashCode());
        System.out.println(sheep.friend);
    }
}
