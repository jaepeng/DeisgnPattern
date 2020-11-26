package com.jae.princilple.invers;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.recevie(new Email());
    }
}

class Email{
    public String getInfor(){
        return "电子右键信息：hello";
    }
}

//完成Person接受消息的功能
//方式一

/**
 * 分析：
 * 1.简单，容易实现
 * 2.如果我们获取的对象是微信，短信等，则新增类，同时Person类也压迫接收相应的方法
 * 3.解决思路：引入一个从抽象的接口IReceive,表示接收者，这样person与接口发生依赖
 *  好处：Email,weixin 等都属于接收的范围，它们各自实现IReciver接口，就符合我们的依赖倒置原则
 *
 */
class Person{
    public void recevie(Email email){
        System.out.println(email.getInfor());
    }
}
