package com.jae.princilple.singleResponsibility;

public class SingleResponsiblity3 {
    public static void main(String[] args) {
        Vehcile2 v=new Vehcile2();
        v.run("汽车");
        v.runWater("大船");
    }
}

/**
 * 分析
 * 1.这种方式没有对原来的类做大修改，知识增加了方法
 * 2.这里虽然没有再类这个级别上遵守单一职责，但是方法级别上，遵守了单一职责
 *
 */
class Vehcile2{
    public void run(String vechile){
        System.out.println(vechile+"在公路运行");
    }

    public void runWater(String vechile){
        System.out.println(vechile+"在水路运行");
    }
}
