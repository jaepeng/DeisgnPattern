package com.jae.adapter.interfaceadapter;

import com.jae.adapter.objectadapter.IVoltage5v;
import com.jae.adapter.objectadapter.Phone;

public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void m1() {
                System.out.println("super.m1();");
            }
        };

        abstractAdapter.m1();
        abstractAdapter.m2();


    }
}
