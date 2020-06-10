package com.example.assignment_2.classes;

import java.sql.Time;

public class ShoppingListClass {

    int id;
    public String name, description;
    Item[] ItemsList;
    Time open,close;
    float val;

    public ShoppingListClass(int id, String name, String description, Item[] ItemsList, Time open, Time close, float val) {
        this.id = id;
        this.name = name;
        this.description = description;

        this.ItemsList  = ItemsList;
        this.val = val;

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
    public Item[] getItemsList() {
        return ItemsList;
    }
    public void setItemsList(Item[] ItemsList) {this.ItemsList = ItemsList;}


}
