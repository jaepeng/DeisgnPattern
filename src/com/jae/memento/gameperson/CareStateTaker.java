package com.jae.memento.gameperson;

import com.jae.memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareStateTaker {
    List<StateMemento> stateMementoList=new ArrayList<>();
    public void addMemento(StateMemento memento){
        stateMementoList.add(memento);
    }
    public StateMemento getMemento(int index){
        return stateMementoList.get(index);
    }
}
