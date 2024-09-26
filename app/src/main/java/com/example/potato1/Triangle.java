package com.example.potato1;

public class Triangle extends Shape {
    private double s1;
    private double s2;
    private double base;
    private double height;

    // Getters
    public double gets1() {
        return s1;
    }
    public double gets2() {
        return s2;
    }
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setFirstSide(double s1) {

        this.s1 = s1;
    }
    public void set2ndSide(double s2) {

        this.s2 = s2;
    }
    public void setBase(double base) {

        this.base = base;
    }
    public void setheight(double height) {

        this.height = height;
    }


    // Implement the abstract method to calculate area
    @Override
    public double getArea() {

        return 0.5 * height * base;
    }

    // Implement the abstract method to calculate perimeter (circumference)
    @Override
    public double getPerimeter() {

        return  s1+s2+base;
    }
}