package com.jae.comand;

public class Client {
    public static void main(String[] args) {
        //使用命令设计模式,通过遥控器对电灯进行操作

        //创建有给电灯的对象(接收者)
        LightReceiver lightReceiver=new LightReceiver();
        //创建电灯相关的相关命令
        LighterOnCommanD lighterOnCommanD = new LighterOnCommanD(lightReceiver);
        LighterOffCommanD lighterOffCommanD = new LighterOffCommanD(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController=new RemoteController();
        //给遥控器设置相关命令
        //no=0,是电灯的开关
        remoteController.setCommand(0,lighterOnCommanD,lighterOffCommanD);
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();
    }
}
