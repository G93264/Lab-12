package com.company;

public class Circle {
    private int radius;
    final double PI = 22.0/7.0;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI*(radius*radius);
    }
}
