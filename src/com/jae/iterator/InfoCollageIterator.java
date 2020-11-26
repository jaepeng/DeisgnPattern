package com.jae.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollageIterator implements Iterator {
    List<Department> departments;//假设信息工程学院以List方式存放
    int index=-1;

    public InfoCollageIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index>=(departments.size()-1)) {
            return false;
        }else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
