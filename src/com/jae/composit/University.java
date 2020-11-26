package com.jae.composit;

//就是Composit，可以管理College

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
List<OrganizationComponent>  organizationComponentList=new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }
    //重写add方法


    @Override
    protected void add(OrganizationComponent organizationComponent) {
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
