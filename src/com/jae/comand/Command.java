package com.jae.comand;
//创建命令接口
public interface Command {
    //执行某个动作,或者某个操作
    public void execute();
    //撤销操作
    void undo();

}
