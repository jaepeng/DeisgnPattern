package com.jae.bulider.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基10米");
    }

    @Override
    public void buildWall() {
        System.out.println("给普通房子打砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子打封顶");
    }
}
