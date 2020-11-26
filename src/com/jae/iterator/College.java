package com.jae.iterator;

import java.util.Iterator;

public interface College {
    public String getName();
    public void addDepartement(String name,String desc);
    public Iterator creatIterator();
}
