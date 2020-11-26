package com.jae.composit;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象 学校
        OrganizationComponent university = new University("清华大学", "C9联盟");
        //学院
        College computerCollege = new College("计算机学院", "计算机学院");
        College infoEngineercollege = new College("信息工程学院",
                "信息工程学院");


        //创建各个学院下面的系（专业）
        computerCollege.add(new Department("软件工程","这个专业不错"));
        computerCollege.add(new Department("网络工程","这个专业也不错"));
        infoEngineercollege.add(new Department("网络通信","这个一般"));
        infoEngineercollege.add(new Department("通信工程","这个很一般"));

        //将两个学院加入到学校
        university.add(computerCollege);
        university.add(infoEngineercollege);
        university.print();
    }
}
