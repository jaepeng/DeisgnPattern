package com.jae.singleton.type4_lazy;

public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("lazy tpye:thread  safe");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(
                "instance.hashCode() == instance2.hashCode() = " +
                        + instance.hashCode() + "+" + instance2.hashCode());
    }
}
////懒汉式(线程安全，同步方法）
class Singleton{
    private static Singleton instance;;
    private Singleton(){

    }
    //提供静态共有方法，加入同步处理代码的问题，解决线程安全问题
    public static synchronized Singleton getInstance(){
        if (null==instance){
            instance=new Singleton();
        }
        return instance;
    }
}
