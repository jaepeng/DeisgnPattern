package com.jae.adapter.classadapter;
//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5v {
    @Override
    public int output5v() {
        //获取到220v的电压
        int srcv =output220v();
        int dstV = srcv / 44;//转成5v
        return dstV;
    }

}

