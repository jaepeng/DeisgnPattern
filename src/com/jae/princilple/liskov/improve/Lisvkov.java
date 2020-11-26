package com.jae.princilple.liskov.improve;

public class Lisvkov {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("------------");
        B b = new B();
        //因为B类不在继承A类，因此调用者，不会再func1是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("1+8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
        //仍让可以使用A类方法
        System.out.println("11-2=" + b.func3(11, 2));
    }
}
//创建一个更加基础的基类
class Base{
    //把更加基础的方法和成员写道Base类中

}

//A类
class A{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class B extends Base {
    //如果b类需要使用到A类的方法，使用组合关系
    private A a=new A();

    public int func1(int a,int b){
        return a+b;
    }
    public int func2(int a,int b){
        return func1(a,b)+9;
    }
    //我们仍让使用A类的方法,这里就是用了组合关系
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}
