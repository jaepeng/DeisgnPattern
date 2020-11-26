package com.jae.memento.gameperson;

public class Person {
    String attackValue;
    String defenseValue;

    public String getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(String attackValue) {
        this.attackValue = attackValue;
    }

    public String getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(String defenseValue) {
        this.defenseValue = defenseValue;
    }
    public StateMemento setStateMemento(){
        return new StateMemento(attackValue,defenseValue);
    }
    public void getStateFromMemnto(StateMemento memento){
        defenseValue=memento.getDefenseValue();
        attackValue=memento.getAttackValue();

    }
    public void setValue(String attack,String defense){
        this.attackValue=attack;
        this.defenseValue=defense;
    }

    public Person(String attackValue, String defenseValue) {
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
    }
}
