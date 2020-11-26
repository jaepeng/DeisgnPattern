package com.jae.bulider.improve;
//指挥者，动态的指定制作流程
public class HouseDirector {
    HouseBuilder houseBuilder=null;
    //通过构造器其传入houseBUilder

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter，传入houseBUilder

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //具体的建造流程（建造房子的具体顺序），交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
