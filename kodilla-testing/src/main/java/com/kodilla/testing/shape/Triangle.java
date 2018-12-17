package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private double field;
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.shapeName = "triangle";
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return 0.5 * base * height;
    }
}
