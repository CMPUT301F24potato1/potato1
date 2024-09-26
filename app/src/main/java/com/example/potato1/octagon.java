package com.example.potato1;

public class octagon extends Shape {
    private double side;

    // Getter for side
    public double getSide() {
        return side;
    }

    // Setter for side
    public void setSide(double side) {
        this.side = side;
    }

    // Implement the abstract method to calculate area
    @Override
    public double getArea() {
        return 2*(1+Math.sqrt(2))*Math.pow(this.side, 2);
    }

    // Implement the abstract method to calculate perimeter
    @Override
    public double getPerimeter() {
        return 8 * this.side;
    }
}
