// Square.java
public class Square extends Shape {
    private double sideLength;

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Get side length
    public double getSideLength() {
        return sideLength;
    }

    // Set side Length method
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // calculate the Area of square
    public double calculateArea() {
        return sideLength * sideLength;
    }

}
