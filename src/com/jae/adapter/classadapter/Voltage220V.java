package com.jae.adapter.classadapter;
//被适配的类
public class Voltage220V {
    //输出220v的电压
    public int output220v(){
        int src=220;
        System.out.println("电压："+src+"v");
        return src;
    }
}
