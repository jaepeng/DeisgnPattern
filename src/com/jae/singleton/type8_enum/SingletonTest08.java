package com.jae.singleton.type8_enum;

public class SingletonTest08 {
    public static void main(String[] args) {
        System.out.println("枚举实现");
        Singleton instance=Singleton.INSTANCE;
        Singleton instance2=Singleton.INSTANCE;
        System.out.println(instance==instance2);
        instance.sayOK();
    }
}
//使用枚举可以实现单例，推荐使用
enum Singleton{
    INSTANCE;//验证属性
    public void sayOK(){
        System.out.println("ok");
    }
}