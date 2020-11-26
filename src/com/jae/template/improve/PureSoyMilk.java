package com.jae.template.improve;

public class PureSoyMilk extends SoyaMilk{
    @Override
    void add() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
