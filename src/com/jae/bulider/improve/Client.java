package com.jae.bulider.improve;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子指挥着
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房子,返回产品（房子）
        House house=houseDirector.constructHouse();
        System.out.println("流程：");

    }
}
