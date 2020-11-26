package com.jae.flyweight;

import java.util.HashMap;

//网站工厂类，根据需求返回网站
public class WebSiteFactory {
    //集合，充当池的作用
    private HashMap<String,WebSite> pool=new HashMap<>();


    //根据网站的类型，放回一个网站，如果没有就创建一个，放入池
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){//如果不存在，则新建一个
            pool.put(type,new ConcreteWebSite(type));

        }
        return pool.get(type);
    }
    //获取网站分类的总数 ,池中有多少个类型
    public int getWebSiteCount(){
        return pool.size();
    }
}
