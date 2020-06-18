package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Elmurzaev Zelimhan Bulatovich");
        student.setGroup("group 132-B");
        student.setEntrance(new Date());
        System.out.println("Student full name is: " + student.getFullName() + System.lineSeparator() + "Student group: " + student.getGroup());
    }
}
