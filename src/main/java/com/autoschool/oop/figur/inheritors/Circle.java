package com.autoschool.oop.figur.inheritors;

import com.autoschool.oop.figur.Figure;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle (name = %s, area = %2f)", name, area());
    }

    @Override
    protected double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}