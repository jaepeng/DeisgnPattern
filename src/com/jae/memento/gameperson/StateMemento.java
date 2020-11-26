package com.jae.memento.gameperson;

public class StateMemento {
    String defenseValue;
    String attackValue;

    public StateMemento(String attackValue, String defenseValue) {
        this.defenseValue = defenseValue;
        this.attackValue = attackValue;
    }

    public String getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(String defenseValue) {
        this.defenseValue = defenseValue;
    }

    public String getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(String attackValue) {
        this.attackValue = attackValue;
    }
}
