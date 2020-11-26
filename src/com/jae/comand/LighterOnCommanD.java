package com.jae.comand;

public class LighterOnCommanD implements Command {
    //聚合LighterReceiver,让它来完成打开和撤销
    LightReceiver lightReceiver;
    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        //撤销就是关闭
        lightReceiver.off();
    }

    public LighterOnCommanD(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
}
