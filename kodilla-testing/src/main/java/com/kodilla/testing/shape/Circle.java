package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class Circle implements Shape {
    private String shapeName;
    private double field;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.shapeName = "circle";
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        return 3.14 * sqrt(radius);
    }
}
