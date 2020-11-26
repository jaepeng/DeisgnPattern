package com.jae.observe;

public class CurrentConditions implements Observe{
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void updata(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
    public void display(){
        System.out.println("今天的气温:"+temperature);
        System.out.println("今天的压强"+pressure);
        System.out.println("今天的湿度"+humidity);
    }
}
