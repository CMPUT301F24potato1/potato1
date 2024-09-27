package com.example.potato1;

public class Circle extends Shape {
    private double radius;

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement the abstract method to calculate area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Implement the abstract method to calculate perimeter (circumference)
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}