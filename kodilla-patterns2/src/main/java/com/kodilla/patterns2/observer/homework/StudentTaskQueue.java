package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTaskQueue implements Observable {
    private Observer observer;
    private final List<Task> tasks;
    private final Student student;

    public StudentTaskQueue(Student student) {
        tasks = new ArrayList<>();
        this.student = student;
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObservers() {
        observer.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observer = null;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Student getStudent() {
        return student;
    }
}
