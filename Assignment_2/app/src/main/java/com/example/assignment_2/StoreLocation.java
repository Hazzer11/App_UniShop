package com.example.assignment_2;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class StoreLocation {
    List<com.example.assignment_2.Item> ItemList;
    String name, company;
    Time open,close;
    com.example.assignment_2.Item[] ItemsList;
    void StoreLocation(){

    }
    public Time getOpen() {
        return open;
    }
    public void setOpen(Time open) {
        this.open = open;
    }
    public Time getClose() {
        return close;
    }
    public void setClose(Time close) {
        this.close = close;
    }
}
