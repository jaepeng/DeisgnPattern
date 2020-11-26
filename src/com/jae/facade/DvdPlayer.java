package com.jae.facade;

public class DvdPlayer {
    //使用单例模式,使用饿汉式
    private static DvdPlayer instance=new DvdPlayer();
    public static DvdPlayer getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("dvd打卡了");
    }
    public void off(){
        System.out.println("dvd关闭了");
    }
    public void player(){
        System.out.println("播放视频");
    }
    public void pause(){
        System.out.println("暂停播放");
    }
}
