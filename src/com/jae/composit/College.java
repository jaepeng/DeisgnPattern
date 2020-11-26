package com.jae.composit;

import java.util.ArrayList;
import java.util.List;

public class College  extends OrganizationComponent{
    //这里的List中存放的是department
    List<OrganizationComponent> organizationComponentList=new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }
    //重写add方法


    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //将来实际业务中，Colleage的add方法和University的add方法，不一样
        organizationComponentList.add(organizationComponent);
    }
    //重写romove方法

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        //输出University包含的学院
        System.out.println("========="+getName()+"========");
        for (OrganizationComponent o:organizationComponentList){
            o.print();
        }
    }
}
