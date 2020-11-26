package com.jae.vistor;

/*
说明:
1.这里使用到了双分派,即首先在客户端程序中,将具体状态传递到Woman中,第一次分派
2.然后womann类调用作为参数的具体方法中getWomanResult,同时将自己(this)传送进去
完成了第二次分派
 */
public class WoMan extends Person {
    @Override
    public void accept(Action action) {
        action.getWoManResult(this);
    }
}
