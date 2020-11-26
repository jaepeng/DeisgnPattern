package com.jae.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    //学院集合
    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    //遍历所有学院,然后调用,输出各个学院的系
    public void printCollege(){
        //从collegeList,取出所有学院
        Iterator<College> iterator=colleges.iterator();
        while (iterator.hasNext()){
            College college=iterator.next();
            System.out.println("=="+college.getName()+"===");
            printDepartment(college.creatIterator());//得到对应的迭代器
        }
    }
    
    //输出 学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName());
        }
    }
    
}
