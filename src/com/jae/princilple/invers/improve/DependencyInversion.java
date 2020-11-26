package com.jae.princilple.invers.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        //客户端无需做出改变也可以
        Person person = new Person();
        person.recevie(new Email());
        person.recevie(new weixin());
    }
}

class Email implements IReciver{
    public String getInfor(){
        return "电子右键信息：hello";
    }
}
class weixin implements IReciver{
    @Override
    public String getInfor() {
        return "微信消息：ok";
    }
}
//定义一个接口
interface IReciver{
    public String getInfor();
}

//方式2
class Person{

    public void recevie(IReciver reciver){//与接口发生依赖
        System.out.println(reciver.getInfor());
    }
}
