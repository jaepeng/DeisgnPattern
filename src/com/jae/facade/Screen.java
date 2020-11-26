package com.jae.facade;

public class Screen {
    private static Screen instance=new Screen();

    public static Screen getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("屏幕打开");
    }
    public void up(){
        System.out.println("屏幕上升");
    }
    public void down(){
        System.out.println("屏幕下降");

    }

}
