package com.jae.observe;

public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData对象
        WeatherData weatherData=new WeatherData();


        //创建观察者
        CurrentConditions currentConditions=new CurrentConditions();
        BaiduWeather baiduWeather=new BaiduWeather();

        //注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduWeather);

        //remove
        weatherData.removeObserver(currentConditions);
        //测试
        System.out.println("通知各个观察者");
        weatherData.setData(12,22,20);


    }
}
