package com.jae.vistor;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的评价:失败");
    }

    @Override
    public void getWoManResult(WoMan woman) {
        System.out.println("女人的评价:失败");
    }
}
