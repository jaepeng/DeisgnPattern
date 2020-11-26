package com.jae.proxy.dynamicproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("动态代理,老师上课");
    }

    @Override
    public void sayHello(String name) {
        System.out.println(name+"打了招呼");
    }
}
