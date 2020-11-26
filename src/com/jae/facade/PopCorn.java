package com.jae.facade;

public class PopCorn {
    private static PopCorn instance=new PopCorn();

    public static PopCorn getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("爆米花打开");
    }
    public void off(){
        System.out.println("爆米花关闭");

    }
    public void pop(){
        System.out.println("正在制作爆米花");
    }

}
