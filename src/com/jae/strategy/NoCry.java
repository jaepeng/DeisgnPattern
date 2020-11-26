package com.jae.strategy;

public class NoCry implements CryBeahivor {
    @Override
    public void call() {
        System.out.println("不会叫");
    }

}
