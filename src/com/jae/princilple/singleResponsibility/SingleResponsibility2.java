package com.jae.princilple.singleResponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle car=new RoadVehicle();
        car.run("qiche");

    }
}

/**
 * 方法二分析
 * 1.遵守单一职责原则
 * 2.但是这样改动太大，即将分离，同时修改客户端
 * 3.改进：直接修改Vehicle 类，改动的代码少
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在路上运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水里");
    }
}
