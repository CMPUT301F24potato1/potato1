package com.example.potato1;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

	@Override
	public double getArea() {
		return this.width * this.length;
	}

	@Override
	public double getPerimeter() {
		return this.width * 2 + this.length * 2;
	}
}
