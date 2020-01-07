package com.drpicox.practica;

public class Clothing implements Product{

    private int id;
    private String material;
    private String color;
    private int size;

    public Clothing(int id, String material, String color, int size) {
        this.id = id;
        this.material = material;
        this.color = color;
        this.size = size;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
