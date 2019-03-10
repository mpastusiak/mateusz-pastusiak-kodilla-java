package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Today's shopping!", "sugar", 2);
            case PAINTING_TASK:
                return new PaintingTask("Final work!", "red", "house");
            case DRIVING_TASK:
                return new DrivingTask("Weekend trip!", "Ciechocinek", "car");
            default:
                return null;
        }
    }
}
