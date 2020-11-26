package com.jae.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    List<Department> departmentList;

    public InfoCollege() {
        departmentList=new ArrayList<>();
        addDepartement("信息安全","信息安全专业");
        addDepartement("网页安全","网页安全专业");
        addDepartement("网络安全","网络安全专业");
    }

    @Override
    public String getName() {
        return "信息工程";
    }

    @Override
    public void addDepartement(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);


    }

    @Override
    public Iterator creatIterator() {
        return new InfoCollageIterator(departmentList);
    }
}
