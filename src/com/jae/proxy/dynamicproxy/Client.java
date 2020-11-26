package com.jae.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        //创建一个目标对象
        TeacherDao target = new TeacherDao();
        //给目标对象,创建代理对象  可以转换成ITeacherDao
        ITeacherDao proxyInstance =
                (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        //可以看出proxyInstanceclass com.sun.proxy.$Proxy0,内存中
        //动态生成了代理对象
        System.out.println("proxyInstance"+proxyInstance.getClass());
        //通过代理对象调用目标对象的方法
        proxyInstance.sayHello("tom");

    }
}
