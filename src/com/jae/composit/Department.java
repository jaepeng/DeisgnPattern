package com.jae.composit;

public class Department extends OrganizationComponent {
    //没有集合
    public Department(String name, String des) {
        super(name, des);
    }
    //add和remove不用再写了，因为他是叶子节点，不需要关注其他了

    @Override
    public void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

}
