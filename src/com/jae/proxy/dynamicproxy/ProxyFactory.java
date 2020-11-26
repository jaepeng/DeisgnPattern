package com.jae.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //维护一个目标对象,以Object对象来维护
    private Object target;


    //构造器,对target进行实例化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){

        /*
        说明:
        1.Classloader:指定当前目标对象使用的类加载器,获取加载器的方法固定
        2.interfaces:目标对象实现的接口对象,使用泛型的方式确认类型
        3.InvocationHalder,事件处理,执行目标对象的方法,会触发事件处理器的方法,会把当前执行的
        目标对象方法作为参数传入

         new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk代理开始");
                        //通过反射机制调用目标对象的方法
                        Object returnVal=method.invoke(target,args);
                        return returnVal;
                    }
                }

         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),((proxy, method, args) -> {
                    System.out.println("jdk代理开始");
                    Object returnVal=method.invoke(target,args);
                    System.out.println("jdk代理结束");
                    return returnVal;
                })
               );
    }
}
