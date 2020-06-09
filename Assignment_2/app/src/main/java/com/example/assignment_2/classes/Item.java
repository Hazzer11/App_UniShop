package com.example.assignment_2.classes;

public class Item {
    private int id, image;
    private String name, description;
    private double value;

    public Item(int id, int image, String name, String description,double value) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
        this.value=value;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
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
    public double getValue(){return value;}
    public void setValue(double value){this.value = value;}
}
