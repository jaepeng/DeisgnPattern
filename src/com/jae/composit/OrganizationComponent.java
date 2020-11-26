package com.jae.composit;

public abstract class OrganizationComponent {
    private String name;
    private String des;
    protected void add(OrganizationComponent organizationComponent)
    {//默认实现
        throw new UnsupportedOperationException();


    }
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();

    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }
    //打印方法,这个类的下面的子类都需要实现
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
