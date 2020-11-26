package com.jae.observe;

public class BaiduWeather implements Observe
{
    private float temperatrue;
    private float pressure;
    private float humidity;
    @Override
    public void updata(float temperatrure, float perssure, float humidity) {
        this.temperatrue=temperatrure;
        this.pressure=perssure;
        this.humidity=humidity;
        display();
    }

    private void display() {
        System.out.println("=========百度公司为您提供服务=========");
        System.out.println("今日气温:"+temperatrue);
        System.out.println("今日压强"+pressure);
        System.out.println("今日湿度"+humidity);
    }
}
