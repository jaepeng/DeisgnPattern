package com.jae.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        originator.setState("状态1");

        //保存当前状态:1
        caretaker.add(originator.saveStatememento());

        originator.setState("状态2");
        caretaker.add(originator.saveStatememento());

        originator.setState("状态3");
        caretaker.add(originator.saveStatememento());

        //恢复的状态1
        System.out.println("当前状态:"+originator.getState());
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复后的状态"+originator.getState());


    }
}
