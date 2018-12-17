package com.kodilla.testing.shape;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testAddFigure() {
        //Given
        Shape newFigure = new Square(3);

        //When
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(newFigure);

        //Then
        Assert.assertEquals(newFigure, shapeCollector.getFigure(0));
    }
    @Test
    public void testRemoveFigure() {

        //Given
        Shape newFigure = new Triangle(2,4);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(newFigure);

        //When
        boolean result = shapeCollector.removeFigure(newFigure);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(null, shapeCollector.getFigure(0));
    }
    @Test
    public void testShowFigures() {

        //Given
        Shape newFigure = new Triangle(2,4);
        Shape newFigure2 = new Square(3);
        Shape newFigure3 = new Circle(5);

        ArrayList<Shape> newFigures = new ArrayList<Shape>();
        newFigures.add(newFigure);
        newFigures.add(newFigure2);
        newFigures.add(newFigure3);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(newFigure);
        shapeCollector.addFigure(newFigure2);
        shapeCollector.addFigure(newFigure3);

        //When
        ArrayList<Shape> result = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(newFigures, result);
    }
}
