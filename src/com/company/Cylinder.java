package com.company;

public class Cylinder extends Circle {
    private int length;

    public Cylinder() {
        super();
        this.length = 1;
    }

    public Cylinder(int radius, int length) {
        super(radius);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getArea(){
       return  2*PI*(getRadius()*length)+super.getArea()*2;
    }
}
