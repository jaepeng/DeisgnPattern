package com.jae.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    ///这里需要知道department是以怎样的方式存放的
    //假设department是数组形式存放
    Department[] departments;
    int position=0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override


    public boolean hasNext() {
        if (position>=departments.length||departments[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    //删除方法默认空实现
    public void remove(){

    }
}
