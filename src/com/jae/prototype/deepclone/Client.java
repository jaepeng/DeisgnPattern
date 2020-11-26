package com.jae.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name="松江";
        p.deepCloneableTarget=new DeepCloneableTarget("小雨","下雪");

        //方式一进行深拷贝
//        DeepProtoType p2 =(DeepProtoType) p.clone();
//        System.out.println("p1。name"+p.name+"p.hascode"+p.deepCloneableTarget.hashCode());
//        System.out.println("p2。name"+p2.name+"p2.hascode"+p2.deepCloneableTarget.hashCode());

        //方式二进行深拷贝
        DeepProtoType p2=(DeepProtoType) p.deepClone();
        System.out.println("p1。name"+p.name+"p.hascode"+p.deepCloneableTarget.hashCode());
        System.out.println("p2。name"+p2.name+"p2.hascode"+p2.deepCloneableTarget.hashCode());

    }
}
