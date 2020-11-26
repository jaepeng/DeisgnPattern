package com.jae.singleton.type3_lazy;

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("lazy tpye:thread not safe");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(
                "instance.hashCode() == instance2.hashCode() = " +
                        + instance.hashCode() + "+" + instance2.hashCode());
    }
}
//懒汉式(线程不安全）
class Singleton{
    private static Singleton instance;;
    private Singleton(){

    }
    //提供静态共有方法，当使用该方法时，才去创建
    //懒汉式
    public static Singleton getInstance(){
        if (null==instance){
            instance=new Singleton();
        }
        return instance;
    }
}
