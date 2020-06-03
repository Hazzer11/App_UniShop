package com.example.assignment_2;

import android.util.EventLogTags;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.sql.Time;

public class ShoppingListClass {

    int id;
    public String name, description;
    LatLng latLng ;
    MarkerOptions options ;
    com.example.assignment_2.Item[] ItemsList;
    Time open,close;

    public ShoppingListClass(int id,LatLng latLng,   String name, String description,MarkerOptions options,com.example.assignment_2.Item[] ItemsList,Time open,Time close) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.latLng  = latLng ;
        this.options  =options ;
        this.ItemsList  = ItemsList;
        this.open  =open ;
        this.close  =close ;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LatLng getLatLng() {
        return latLng;
    }
    public void setLatLng(LatLng id) {
        this.latLng = latLng;
    }
    public MarkerOptions getOptions() {
        return options;
    }
    public void setOptions(MarkerOptions options) {
        this.options = options;
    }
    public com.example.assignment_2.Item[] getItemsList() {
        return ItemsList;
    }
    public void setItemsList(com.example.assignment_2.Item[] ItemsList) {this.ItemsList = ItemsList;}
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
