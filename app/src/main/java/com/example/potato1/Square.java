package com.example.potato1;

public class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Set side length
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // Get side length.
    public double getSideLength() {
        return sideLength;
    }

     // Override method for Area
    @Override
    public double getArea() {
        return sideLength * sideLength; 
    }

    // Override method for Perimeter
    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }
}
