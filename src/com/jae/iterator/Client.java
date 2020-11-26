package com.jae.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();
        CompuyterCollege compuyterCollege = new CompuyterCollege();

        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(compuyterCollege);
        collegeList.add(infoCollege);
        OutPutImpl outPut=new OutPutImpl(collegeList);
        outPut.printCollege();

    }
}
