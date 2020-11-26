package com.jae.observe;

//一个接口,让WeatherData来实现
public interface Subject {
    public void registerObserver(Observe o);
    public void removeObserver(Observe o);
    public void notifyObserver();
}
