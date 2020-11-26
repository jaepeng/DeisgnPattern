package com.jae.observe;


import java.util.ArrayList;

/*
1.包含最新的天气信息
2.含有观察者集合,使用ArrayList管理
3.当有数据更新时 遍历ArrayList,通知所有的接入方,
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;

    //观察者集合
    private ArrayList<Observe> observes;

    public WeatherData() {
        observes=new ArrayList<>();
    }

    public void setData(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        dataChange();
    }

    private void dataChange() {
        //调用接入的updata方法,通知所有oserve
        System.out.println("数据有所改变!");
        notifyObserver();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observe o) {
            observes.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observe o) {

        if (observes.contains(o)){
            System.out.println("有人取消关注");
            observes.remove(o);
        }

    }

    //通知一个观察者
    @Override
    public void notifyObserver() {
        for (Observe observe:
             observes) {
            observe.updata(this.temperature,pressure,this.humidity);
        }
    }
}
