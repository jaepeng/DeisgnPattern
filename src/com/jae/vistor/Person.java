package com.jae.vistor;

public abstract class Person {
    //提供一个接口使得访问者能够访问
    public abstract void accept(Action action);
}
