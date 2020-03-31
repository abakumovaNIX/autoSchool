package com.autoschool.oop.figur.inheritors;

import com.autoschool.oop.figur.Figure;

public class Square extends Figure {

    private int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format(
                "Square (name = %s, area = %2f)", name, area());
    }

    @Override
    protected double area() {
        return side * side;
    }
}