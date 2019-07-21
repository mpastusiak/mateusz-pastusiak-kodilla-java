package com.kodilla.patterns2.observer.homework;

public class Teacher implements Observer {
    private final String teacherName;
    private int updateCount;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(StudentTaskQueue studentTaskQueue) {
        System.out.println(teacherName + ": You have new task from "
                + studentTaskQueue.getStudent().getStudentName() + " to check" + "\n" + " (total: "
                + studentTaskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
