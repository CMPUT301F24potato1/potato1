package com.example.potato1;

public class Hexagon extends Shape{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((3*Math.sqrt(3))/2) * Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return 6 * this.side;
    }
}
