package com.jae.comand;

//遥控器
public class RemoteController {
    //开按钮
    Command[] onCommands;
    Command[] offCommands;
    //撤销命令
    Command undoCommands;

    public RemoteController(){
        onCommands=new Command[5];
        offCommands=new Command[5];
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] =new NoCommand();
            offCommands[i] =new NoCommand();


        }

    }

    //给我们的按钮设置需要的命令即可
    public void setCommand(int no,Command oncommand,Command offcommand)
    {
        onCommands[no]=oncommand;
        offCommands[no]=offcommand;
    }
    //按下开的按钮如何处理
    public void onButtonWasPushed(int no){
        //找到按下的开的按钮,并执行
        onCommands[no].execute();
        //记录这次的操作,用于撤销
        undoCommands=onCommands[no];
    }
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommands=offCommands[no];
    }
    public void undoButtonWasPushed(){
        undoCommands.undo();
    }
}
