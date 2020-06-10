package com.example.assignment_2.classes;

import java.util.List;

public class StoreLocation {
    List<Item> ItemList;
    String name, open,close;
    double lon,lat;
    int id;

    public StoreLocation(int id, double lon, double lat, String name, String open, String close, List<Item> list) {
        this.id =id;
        this.lon =lon;
        this.lat =lat;
        this.name =name;
        this.open =open;
        this.close =close;
        this.ItemList =list;
    }

    public double getLon(){return lon;}
    public void setLon(double lon) {this.lon= lon;}////////////lon
    public double getLat(){return lat;}
    public void setLat(double lat) {
        this.lat = lat;
    }//////////lat
    public String getName(){return name;}
    public void setName(String name) {
        this.name = name;
    }////////name
    public int getid(){return id;}
    public void setId(int id){this.id =id;}///////////////////id
    public List<Item> getItemList() {return ItemList;}
    public void setItemList(List<Item> ItemList){this.ItemList=ItemList;}//////// Item List
    public String getOpen() {
        return open;
    }
    public void setOpen(String open) {
        this.open = open;
    }/////open
    public String getClose() {
        return close;
    }
    public void setClose(String close) {
        this.close = close;
    }///////close
}
