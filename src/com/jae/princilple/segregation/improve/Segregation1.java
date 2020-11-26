package com.jae.princilple.segregation.improve;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());//A类通过接口去依赖B
        a.depend2(new B());
        C c = new C();
        c.depend1(new D());//C类通过接口去依赖D
    }
}
//接口1
interface Interface1{
    void operation1();
}
//接口2
interface interface2{
    void operation2();
    void operation3();
}
//接口3
interface  inteface3{
    void operation4();
    void operation5();
}

class B implements Interface1,interface2 {
    @Override
    public void operation1() {
        System.out.println("B 中的operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 中的operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 中的operation3");
    }

    }

class D implements Interface1,inteface3 {
    @Override
    public void operation1() {
        System.out.println("D 中的operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 中的operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 中的operation5");
    }
}

class A{//A类接口通过INterface依赖（使用）B类，但是只会用到1，2，3方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(interface2 i){
        i.operation2();
    }
    public void depend3(interface2 i){
        i.operation3();
    }
}

class C{//C类接口通过INterface依赖（使用）D类，但是只会用到1，4，5方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(inteface3 i){
        i.operation4();
    }
    public void depend5(inteface3 i){
        i.operation5();
    }
}
