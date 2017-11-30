package com.javasampleapproach.log4j2.controller;

import java.util.ArrayList;

public class NewClass{
    ArrayList<String> list = new ArrayList<String>();
    {
        list.add("0");
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
        list.add("60");
        list.add("70");
        list.add("80");
        list.add("90");
    }
    public ArrayList<String> getList(){
        return list;
    }
}
