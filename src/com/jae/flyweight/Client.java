package com.jae.flyweight;

public class Client {
    public static void main(String[] args) {
        //创建工厂类
        WebSiteFactory webSiteFactory=new WebSiteFactory();
        //新闻形式
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));

        //博客形式
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("jack"));
        //博客形式
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("pig"));
        System.out.println("网站的分类："+webSiteFactory.getWebSiteCount());

    }
}
