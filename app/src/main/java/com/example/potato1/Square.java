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

    // Calculate Area
    public double calculateArea() {
        return sideLength * sideLength;
    }

    // Calucalate the perimeter
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
