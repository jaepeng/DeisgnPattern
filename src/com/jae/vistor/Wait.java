package com.jae.vistor;

public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价:待定");
    }

    @Override
    public void getWoManResult(WoMan woman) {
        System.out.println("女人给的评价:待定");
    }
}
