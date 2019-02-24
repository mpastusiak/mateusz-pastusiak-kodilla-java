package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();
        //When
        toDoList.getTasks().add("It's task to do");
        inProgressList.getTasks().add("It's task in progress");
        doneList.getTasks().add("It's done task");
        //Then
        Assert.assertEquals("It's task to do", toDoList.getTasks().get(0));
        Assert.assertEquals("It's task in progress", inProgressList.getTasks().get(0));
        Assert.assertEquals("It's done task", doneList.getTasks().get(0));
    }
}
