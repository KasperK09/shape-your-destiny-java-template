package org.example;

public class Rectangle {

    private double length;
    private double width;

    public double getArea(double length, double width) {
        return length * width;
    }
    
    //does not like it when I do @Override
    public double getPerimeter() {
        return (2 * length) * (2 * width);
    }
}
