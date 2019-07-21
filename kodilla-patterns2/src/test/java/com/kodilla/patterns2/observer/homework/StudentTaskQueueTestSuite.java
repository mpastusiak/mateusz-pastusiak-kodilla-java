package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTaskQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTaskQueue janKowalskiQueue = new StudentTaskQueue(new Student("Jan Kowalski"));
        StudentTaskQueue zbigniewBiernackiQueue = new StudentTaskQueue(new Student("Zbigniew Biernacki"));
        StudentTaskQueue annaNowakQueue = new StudentTaskQueue(new Student("Anna Nowak"));

        Teacher adamMickiewicz = new Teacher("Adam Mickiewicz");
        Teacher henrykSienkiewicz = new Teacher("Henryk Sienkiewicz");
        janKowalskiQueue.registerObserver(adamMickiewicz);
        zbigniewBiernackiQueue.registerObserver(henrykSienkiewicz);
        annaNowakQueue.registerObserver(adamMickiewicz);

        Task task1 = new Task("First Task", "You must do it!");
        Task task2 = new Task("Second Task", "Java Task");
        Task task3 = new Task("Third Task", "I believe that you can do it!");
        Task task4 = new Task("Last Task", "This is the end :(");

        //When
        janKowalskiQueue.addTask(task1);
        zbigniewBiernackiQueue.addTask(task1);
        annaNowakQueue.addTask(task1);
        janKowalskiQueue.addTask(task2);
        annaNowakQueue.addTask(task2);
        janKowalskiQueue.addTask(task3);
        annaNowakQueue.addTask(task3);
        zbigniewBiernackiQueue.addTask(task2);
        annaNowakQueue.addTask(task4);

        //Then
        assertEquals(7, adamMickiewicz.getUpdateCount());
        assertEquals(2, henrykSienkiewicz.getUpdateCount());
    }
}
