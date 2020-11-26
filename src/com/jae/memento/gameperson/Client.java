package com.jae.memento.gameperson;

public class Client {
    public static void main(String[] args) {
        CareStateTaker careStateTaker=new CareStateTaker();
        Person person=new Person("攻击力:15","20");
        System.out.println("person:"+person.getAttackValue());
        careStateTaker.addMemento(person.setStateMemento());
        System.out.println("现在的攻击力是:"+person.getAttackValue());

        //改变状态
        person.setValue("66","77");
        careStateTaker.addMemento(person.setStateMemento());
        System.out.println("改变后的状态:"+person.getAttackValue());
        person.setValue("100","200");
        careStateTaker.addMemento(person.setStateMemento());
        //恢复状态
        person.getStateFromMemnto(careStateTaker.getMemento(0));
        System.out.println("恢复后的状态:" + person.getAttackValue());

    }
}
