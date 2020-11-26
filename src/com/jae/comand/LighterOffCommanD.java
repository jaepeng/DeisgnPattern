package com.jae.comand;

public class LighterOffCommanD implements Command {
    //聚合LighterReceiver,让它来完成打开和撤销
    LightReceiver lightReceiver;
    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.off();
    }

    @Override
    public void undo() {
        //撤销就是关闭
        lightReceiver.on();
    }

    public LighterOffCommanD(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
}
