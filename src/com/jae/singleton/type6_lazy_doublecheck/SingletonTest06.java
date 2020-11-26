package com.jae.singleton.type6_lazy_doublecheck;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
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
    //volatile 一旦instance有修改值，直接就能刷到主存中去，有同步的效果
    private static volatile Singleton instance;;
    private Singleton(){

    }
    //提供静态共有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐使用
    public static synchronized Singleton getInstance(){
        if (null==instance){
            synchronized (Singleton.class){
                if (null==instance){
                    instance=new Singleton();
                }
            }

        }
        return instance;
    }
}
