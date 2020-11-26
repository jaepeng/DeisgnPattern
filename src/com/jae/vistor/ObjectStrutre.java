package com.jae.vistor;

import java.util.LinkedList;
import java.util.List;
//数据结构,管理多人
public class ObjectStrutre {
    //维护了一个集合
    private List<Person> personList=new LinkedList<>();
    //增加到list
    public void attach(Person p){
        personList.add(p);
    }
    public void detach(Person person){
        personList.remove(person);
    }
    //显示测评情况
    public void display(Action action){
        for (Person person:personList
             ) {
            person.accept(action);
        }
    }
}
