package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class Square implements Shape {
    private String shapeName;
    private double field;
    private double side;

    public Square(double side) {
        this.side = side;
        this.shapeName = "square";
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        return sqrt(side);
    }
}
