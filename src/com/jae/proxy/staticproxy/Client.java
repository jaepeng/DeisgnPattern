package com.jae.proxy.staticproxy;

public class Client  {
    public static void main(String[] args) {
        TeacherDao teacherDao=new TeacherDao();
        //创建代理对象,同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy=new TeacherDaoProxy(teacherDao);

        //通过代理对象,调用被代理方法
        //执行的时代理对象的方法,代理对象再区调用目标对象的方法
        teacherDaoProxy.teach();

    }
    /*
    代理开始,老师准备资料
老师授课中
代理结束,老师课程结束
     */
}
