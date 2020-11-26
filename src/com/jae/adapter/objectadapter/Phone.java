package com.jae.adapter.objectadapter;

import com.jae.adapter.objectadapter.IVoltage5v;

public class Phone {
    //充电
    public void charging(IVoltage5v iVoltage5v){
        if (iVoltage5v.output5v()==5){
            System.out.println("电压5v，可以充电");
        }else{
            System.out.println("电压不匹配，不能充电");
        }
    }
}
