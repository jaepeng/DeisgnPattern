package com.jae.princilple.singleResponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
//交通工具类
/**
 * 1.方式一的run方法中，违反了单一职责原则（飞机也在地上运行）
 * 2.解决方案：根据交通工具运行方式不同，分解成不同类即可
 */


class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在地上运行");
    }
}