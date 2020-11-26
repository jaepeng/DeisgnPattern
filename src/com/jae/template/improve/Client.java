package com.jae.template.improve;

public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        System.out.println("制作红豆豆浆");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk PeanuSoyaMilk =new PeanuSoyaMilk();
        PeanuSoyaMilk.make();
        System.out.println("制作纯豆浆");
        SoyaMilk pureSoyMilk=new PureSoyMilk();
        pureSoyMilk.make();

    }
}
