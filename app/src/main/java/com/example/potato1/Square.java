package com.example.potato1;

public class Square extends Shape {
    private double length;

    // Getter for length of side
    public double getLength() {
        return length;
    }

    // Setter for length of side
    public void setLength(double length) {

        this.length = length;
    }

    // Implement the abstract method to calculate area
    @Override
    public double getArea() {

        return length * length;
    }

    // Implement the abstract method to calculate perimeter (circumference)
    @Override
    public double getPerimeter() {

        return length * 4;
    }
}