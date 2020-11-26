package com.jae.bridge;

public class Client {
    public static void main(String[] args) {
        //获取折叠手机（样式+品牌）
        FoldePhone foldePhone = new FoldePhone(new Xiaomi());
        foldePhone.call();
        System.out.println("===========");
        Phone phone=new FoldePhone(new Vivo());
        phone.call();
    }
}
