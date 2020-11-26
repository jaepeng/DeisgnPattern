package com.jae.adapter.objectadapter;

import com.jae.adapter.objectadapter.IVoltage5v;
import com.jae.adapter.objectadapter.Voltage220V;

//适配器类
public class VoltageAdapter  implements IVoltage5v {
    private Voltage220V voltage220V=null;//聚合关系
    //通过构造器传入voltage220v的实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        int dst=0;
        if (null!=voltage220V){
            int src =voltage220V.output220v();
            System.out.println("使用对象适配器");
            dst=src/44;
            System.out.println("适配完成，输出电压为："+dst);

        }
        return dst;
    }
}
