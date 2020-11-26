package com.jae.facade;

public class Stereo {
    private static Stereo instance =new Stereo();

    public static Stereo getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("立体声打开");
    }
    public void off(){
        System.out.println("立体声关闭");

    }
    public void up(){
        System.out.println("调大音量");
    }
}
