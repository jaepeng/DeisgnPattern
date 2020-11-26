package com.jae.vistor;

public class Client {
    public static void main(String[] args) {
        //创建ObjectStrutres
        ObjectStrutre objectStrutre = new ObjectStrutre();

        objectStrutre.attach(new Man());
        objectStrutre.attach(new WoMan());


        //sucess
        Success success=new Success();
        objectStrutre.display(success);

        //Fail
        Fail fail=new Fail();
        objectStrutre.display(fail);

        //Wait
        Wait wait=new Wait();
        objectStrutre.display(wait);
    }
}
