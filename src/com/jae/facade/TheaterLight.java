package com.jae.facade;

public class TheaterLight {
    private static TheaterLight instance=new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("灯光打开");
    }
    public void off(){
        System.out.println("灯光关闭");

    }
    public void bright(){
        System.out.println("提升亮度");
    }
    public void dim(){
        System.out.println("降低亮度");
    }

}
