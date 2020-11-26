package com.jae.proxy.cglibproxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();

        //获取代理对象,并且将目标对象传递给代理对象
        TeacherDao proxyFactory =
                (TeacherDao) new ProxyFactory(teacherDao).getPorxyInstance();
        //执行代理对象的方法,出发intecept方法,从而实现对目标对象的调用
        proxyFactory.teach();
    }
}
