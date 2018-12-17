package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    private String shapeName;
    private double shapeField;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape theFigure = null;
        if (n >= 0 && n < shapes.size()) {
            theFigure = shapes.get(n);
        }
        return theFigure;
    }

    public ArrayList<Shape> showFigures() {
        return shapes;
    }
}
