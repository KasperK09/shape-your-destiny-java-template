package org.example;

public class RightTriangle {

    private double leg_A;
    private double leg_B;

    public RightTriangle(double leg_A, double leg_B) {
        this.leg_A = leg_A;
        this.leg_B = leg_B;
    }

    public double getArea() {
        return (leg_A * leg_B) / 2;
    }
    
    public double getPerimeter() {
        return Math.sqrt(leg_A * leg_A) * (leg_B * leg_B) + leg_A + leg_B;
    }
}