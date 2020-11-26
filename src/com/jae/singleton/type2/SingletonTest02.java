package com.jae.singleton.type2;

public class SingletonTest02 {
    //test
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(
                "instance.hashCode() == instance2.hashCode() = " +
                 + instance.hashCode() + "+" + instance2.hashCode());
    }
}

//饿汉式（静态变量）
class Singleton {
    //1.构造器私有化
    private Singleton() {

    }

    //2.本类内部创建一个对象实例
    private static Singleton instance;

    static{//在静态代码块中，建立单例对象
        instance = new Singleton();
    }

    //3.提供一个公有的静态方法，返回实例对象

    public static Singleton getInstance() {
        return instance;
    }
}