package com.jae.singleton.type7_staticinner;

public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(
                "instance.hashCode() == instance2.hashCode() = " +
                        + instance.hashCode() + "+" + instance2.hashCode());
    }
}


//静态内部类：推荐使用
//1.当外部类被装载时，静态内部类不会被装载。
//2.而需要使用到静态内部类时，静态内部类只会被使用一次，并且此时线程安全（只有一个线程）
class Singleton{
    //volatile 一旦instance有修改值，直接就能刷到主存中去，有同步的效果
    private static volatile Singleton instance;;
    private Singleton(){

    }
    //写一个静态内部类，该类中有一个静态属性Singleton
    private  static class SingletonInstance{
        private  static final Singleton INSTANCE=new Singleton();
    }
    //提供静态共有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance(){

        return SingletonInstance.INSTANCE;
    }
}
