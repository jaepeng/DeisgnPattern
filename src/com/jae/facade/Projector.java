package com.jae.facade;

public class Projector {
    private static Projector instance=new Projector();

    public static Projector getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("投影仪打开");
    }
    public void off(){
        System.out.println("投影仪关闭");

    }
    public void projector(){
        System.out.println("正在投影");
    }
}
