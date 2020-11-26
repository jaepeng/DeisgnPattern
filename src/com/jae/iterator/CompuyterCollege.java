package com.jae.iterator;

import java.util.Iterator;

public class CompuyterCollege implements College{
    Department[] departments;
    int numofDepartment=0;//保存当前数组的对象个数

    public CompuyterCollege() {
      departments=  new Department[5];
      addDepartement("java","java专业");
      addDepartement("c","c专业");
      addDepartement("go","go专业");
      addDepartement("php","php专业");

    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartement(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numofDepartment]=department;
        numofDepartment++;
    }

    @Override
    public Iterator creatIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
